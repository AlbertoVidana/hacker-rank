while read TEXT;
do
    echo "${TEXT}" >> text.txt
done3
sort -k 1n < text.txt