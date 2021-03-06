# 288. Unique Word Abbreviation

[Original Page](https://leetcode.com/problems/unique-word-abbreviation/)

An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of word abbreviations:

<pre>a) it                      --> it    (no abbreviation)

     1
b) d|o|g                   --> d1g

              1    1  1
     1---5----0----5--8
c) i|nternationalizatio|n  --> i18n

              1
     1---5----0
d) l|ocalizatio|n          --> l10n
</pre>

Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary. A word's abbreviation is unique if no _other_ word from the dictionary has the same abbreviation.

Example:  

<pre>Given dictionary = [ "deer", "door", "cake", "card" ]

isUnique("dear") -> `false`
isUnique("cart") -> `true`
isUnique("cane") -> `false`
isUnique("make") -> `true`
</pre>

<div>

<div id="company_tags" class="btn btn-xs btn-warning">Show Company Tags</div>

<span class="hidebutton" style="display: none;">[Google](/company/google/)</span></div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Hash Table](/tag/hash-table/) [Design](/tag/design/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(E) Two Sum III - Data structure design](/problems/two-sum-iii-data-structure-design/) [(M) Generalized Abbreviation](/problems/generalized-abbreviation/)</span></div>