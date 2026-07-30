# Write your MySQL query statement below
-- SELECT sample_id,
-- dna_sequence,
-- species,
-- DNA_SEQUENCE REGEXP '^ATG' AS has_start,
-- DNA_SEQUENCE REGEXP 'TAA$|TAG$|TGA$' AS has_stop,
-- DNA_SEQUENCE REGEXP 'ATAT' AS has_atat,
-- DNA_SEQUENCE REGEXP 'GGG+' AS has_ggg
-- FROM SAMPLES
-- ORDER BY SAMPLE_ID;

SELECT sample_id,
dna_sequence,
species,
DNA_SEQUENCE LIKE 'ATG%' AS has_start,
(DNA_SEQUENCE LIKE '%TAA' OR DNA_SEQUENCE LIKE '%TAG' OR DNA_SEQUENCE LIKE '%TGA') AS has_stop,
DNA_SEQUENCE LIKE '%ATAT%' AS has_atat,
DNA_SEQUENCE REGEXP 'GGG+' AS has_ggg
FROM SAMPLES
ORDER BY SAMPLE_ID;