## Requerments
``` 
Take Data From "https://date.nager.at" API
Collect all ISO country code.
For each country we ask for public holidays
Select country(s) with max num of PH
Select country(s) with min num of PH

Try TO USE PARALLEL STREAMING!!

CountryCodeList.stream()
 .map(cc -> createCountryInfo(cc))
 .min(Comparator(ci->getPhCount())

 createCountryInfo(String cc) {
   call the hollyday api with cc
   CountryInfo {
     cc,
     numPubH;
   }
 } 
```
 
 
## Program Output :

 ``` 
Collect all ISO country code: 

1, Name: Åland Islands, Code: AX, Number Of Holidays: 0
2, Name: Albania, Code: AL, Number Of Holidays: 0
3, Name: Andorra, Code: AD, Number Of Holidays: 0
4, Name: Argentina, Code: AR, Number Of Holidays: 0
5, Name: Australia, Code: AU, Number Of Holidays: 0
6, Name: Austria, Code: AT, Number Of Holidays: 0
7, Name: Bahamas, Code: BS, Number Of Holidays: 0
8, Name: Barbados, Code: BB, Number Of Holidays: 0
9, Name: Belarus, Code: BY, Number Of Holidays: 0
10, Name: Belgium, Code: BE, Number Of Holidays: 0
11, Name: Belize, Code: BZ, Number Of Holidays: 0
12, Name: Benin, Code: BJ, Number Of Holidays: 0
13, Name: Bolivia, Plurinational State of, Code: BO, Number Of Holidays: 0
14, Name: Bosnia and Herzegovina, Code: BA, Number Of Holidays: 0
15, Name: Botswana, Code: BW, Number Of Holidays: 0
16, Name: Brazil, Code: BR, Number Of Holidays: 0
17, Name: Bulgaria, Code: BG, Number Of Holidays: 0
18, Name: Canada, Code: CA, Number Of Holidays: 0
19, Name: Chile, Code: CL, Number Of Holidays: 0
20, Name: China, Code: CN, Number Of Holidays: 0
21, Name: Colombia, Code: CO, Number Of Holidays: 0
22, Name: Costa Rica, Code: CR, Number Of Holidays: 0
23, Name: Croatia, Code: HR, Number Of Holidays: 0
24, Name: Cuba, Code: CU, Number Of Holidays: 0
25, Name: Cyprus, Code: CY, Number Of Holidays: 0
26, Name: Czech Republic, Code: CZ, Number Of Holidays: 0
27, Name: Denmark, Code: DK, Number Of Holidays: 0
28, Name: Dominican Republic, Code: DO, Number Of Holidays: 0
29, Name: Ecuador, Code: EC, Number Of Holidays: 0
30, Name: Egypt, Code: EG, Number Of Holidays: 0
31, Name: El Salvador, Code: SV, Number Of Holidays: 0
32, Name: Estonia, Code: EE, Number Of Holidays: 0
33, Name: Faroe Islands, Code: FO, Number Of Holidays: 0
34, Name: Finland, Code: FI, Number Of Holidays: 0
35, Name: France, Code: FR, Number Of Holidays: 0
36, Name: Gabon, Code: GA, Number Of Holidays: 0
37, Name: Gambia, Code: GM, Number Of Holidays: 0
38, Name: Germany, Code: DE, Number Of Holidays: 0
39, Name: Gibraltar, Code: GI, Number Of Holidays: 0
40, Name: Greece, Code: GR, Number Of Holidays: 0
41, Name: Greenland, Code: GL, Number Of Holidays: 0
42, Name: Grenada, Code: GD, Number Of Holidays: 0
43, Name: Guatemala, Code: GT, Number Of Holidays: 0
44, Name: Guernsey, Code: GG, Number Of Holidays: 0
45, Name: Guyana, Code: GY, Number Of Holidays: 0
46, Name: Haiti, Code: HT, Number Of Holidays: 0
47, Name: Holy See (Vatican City State), Code: VA, Number Of Holidays: 0
48, Name: Honduras, Code: HN, Number Of Holidays: 0
49, Name: Hungary, Code: HU, Number Of Holidays: 0
50, Name: Iceland, Code: IS, Number Of Holidays: 0
51, Name: Indonesia, Code: ID, Number Of Holidays: 0
52, Name: Ireland, Code: IE, Number Of Holidays: 0
53, Name: Isle of Man, Code: IM, Number Of Holidays: 0
54, Name: Italy, Code: IT, Number Of Holidays: 0
55, Name: Jamaica, Code: JM, Number Of Holidays: 0
56, Name: Japan, Code: JP, Number Of Holidays: 0
57, Name: Jersey, Code: JE, Number Of Holidays: 0
58, Name: Korea, Republic of, Code: KR, Number Of Holidays: 0
59, Name: Latvia, Code: LV, Number Of Holidays: 0
60, Name: Lesotho, Code: LS, Number Of Holidays: 0
61, Name: Liechtenstein, Code: LI, Number Of Holidays: 0
62, Name: Lithuania, Code: LT, Number Of Holidays: 0
63, Name: Luxembourg, Code: LU, Number Of Holidays: 0
64, Name: Macedonia, the Former Yugoslav Republic of, Code: MK, Number Of Holidays: 0
65, Name: Madagascar, Code: MG, Number Of Holidays: 0
66, Name: Malta, Code: MT, Number Of Holidays: 0
67, Name: Mexico, Code: MX, Number Of Holidays: 0
68, Name: Moldova, Republic of, Code: MD, Number Of Holidays: 0
69, Name: Monaco, Code: MC, Number Of Holidays: 0
70, Name: Mongolia, Code: MN, Number Of Holidays: 0
71, Name: Montenegro, Code: ME, Number Of Holidays: 0
72, Name: Montserrat, Code: MS, Number Of Holidays: 0
73, Name: Morocco, Code: MA, Number Of Holidays: 0
74, Name: Mozambique, Code: MZ, Number Of Holidays: 0
75, Name: Namibia, Code: NA, Number Of Holidays: 0
76, Name: Netherlands, Code: NL, Number Of Holidays: 0
77, Name: New Zealand, Code: NZ, Number Of Holidays: 0
78, Name: Nicaragua, Code: NI, Number Of Holidays: 0
79, Name: Niger, Code: NE, Number Of Holidays: 0
80, Name: Nigeria, Code: NG, Number Of Holidays: 0
81, Name: Norway, Code: NO, Number Of Holidays: 0
82, Name: Panama, Code: PA, Number Of Holidays: 0
83, Name: Papua New Guinea, Code: PG, Number Of Holidays: 0
84, Name: Paraguay, Code: PY, Number Of Holidays: 0
85, Name: Peru, Code: PE, Number Of Holidays: 0
86, Name: Poland, Code: PL, Number Of Holidays: 0
87, Name: Portugal, Code: PT, Number Of Holidays: 0
88, Name: Puerto Rico, Code: PR, Number Of Holidays: 0
89, Name: Romania, Code: RO, Number Of Holidays: 0
90, Name: Russian Federation, Code: RU, Number Of Holidays: 0
91, Name: San Marino, Code: SM, Number Of Holidays: 0
92, Name: Serbia, Code: RS, Number Of Holidays: 0
93, Name: Singapore, Code: SG, Number Of Holidays: 0
94, Name: Slovakia, Code: SK, Number Of Holidays: 0
95, Name: Slovenia, Code: SI, Number Of Holidays: 0
96, Name: South Africa, Code: ZA, Number Of Holidays: 0
97, Name: Spain, Code: ES, Number Of Holidays: 0
98, Name: Suriname, Code: SR, Number Of Holidays: 0
99, Name: Svalbard and Jan Mayen, Code: SJ, Number Of Holidays: 0
100, Name: Sweden, Code: SE, Number Of Holidays: 0
101, Name: Switzerland, Code: CH, Number Of Holidays: 0
102, Name: Tunisia, Code: TN, Number Of Holidays: 0
103, Name: Turkey, Code: TR, Number Of Holidays: 0
104, Name: Ukraine, Code: UA, Number Of Holidays: 0
105, Name: United Kingdom, Code: GB, Number Of Holidays: 0
106, Name: United States, Code: US, Number Of Holidays: 0
107, Name: Uruguay, Code: UY, Number Of Holidays: 0
108, Name: Venezuela, Bolivarian Republic of, Code: VE, Number Of Holidays: 0
109, Name: Vietnam, Code: VN, Number Of Holidays: 0
110, Name: Zimbabwe, Code: ZW, Number Of Holidays: 0
For each country we ask for public holidays : 

1, Name: Åland Islands, Code: AX, Number Of Holidays: 19
2, Name: Albania, Code: AL, Number Of Holidays: 12
3, Name: Andorra, Code: AD, Number Of Holidays: 4
4, Name: Argentina, Code: AR, Number Of Holidays: 16
5, Name: Australia, Code: AU, Number Of Holidays: 21
6, Name: Austria, Code: AT, Number Of Holidays: 13
7, Name: Bahamas, Code: BS, Number Of Holidays: 11
8, Name: Barbados, Code: BB, Number Of Holidays: 12
9, Name: Belarus, Code: BY, Number Of Holidays: 9
10, Name: Belgium, Code: BE, Number Of Holidays: 11
11, Name: Belize, Code: BZ, Number Of Holidays: 14
12, Name: Benin, Code: BJ, Number Of Holidays: 14
13, Name: Bolivia, Plurinational State of, Code: BO, Number Of Holidays: 12
14, Name: Bosnia and Herzegovina, Code: BA, Number Of Holidays: 15
15, Name: Botswana, Code: BW, Number Of Holidays: 11
16, Name: Brazil, Code: BR, Number Of Holidays: 13
17, Name: Bulgaria, Code: BG, Number Of Holidays: 14
18, Name: Canada, Code: CA, Number Of Holidays: 29
19, Name: Chile, Code: CL, Number Of Holidays: 22
20, Name: China, Code: CN, Number Of Holidays: 7
21, Name: Colombia, Code: CO, Number Of Holidays: 20
22, Name: Costa Rica, Code: CR, Number Of Holidays: 11
23, Name: Croatia, Code: HR, Number Of Holidays: 14
24, Name: Cuba, Code: CU, Number Of Holidays: 9
25, Name: Cyprus, Code: CY, Number Of Holidays: 17
26, Name: Czech Republic, Code: CZ, Number Of Holidays: 13
27, Name: Denmark, Code: DK, Number Of Holidays: 15
28, Name: Dominican Republic, Code: DO, Number Of Holidays: 13
29, Name: Ecuador, Code: EC, Number Of Holidays: 11
30, Name: Egypt, Code: EG, Number Of Holidays: 6
31, Name: El Salvador, Code: SV, Number Of Holidays: 26
32, Name: Estonia, Code: EE, Number Of Holidays: 12
33, Name: Faroe Islands, Code: FO, Number Of Holidays: 17
34, Name: Finland, Code: FI, Number Of Holidays: 15
35, Name: France, Code: FR, Number Of Holidays: 15
36, Name: Gabon, Code: GA, Number Of Holidays: 11
37, Name: Gambia, Code: GM, Number Of Holidays: 9
38, Name: Germany, Code: DE, Number Of Holidays: 19
39, Name: Gibraltar, Code: GI, Number Of Holidays: 12
40, Name: Greece, Code: GR, Number Of Holidays: 15
41, Name: Greenland, Code: GL, Number Of Holidays: 16
42, Name: Grenada, Code: GD, Number Of Holidays: 13
43, Name: Guatemala, Code: GT, Number Of Holidays: 13
44, Name: Guernsey, Code: GG, Number Of Holidays: 9
45, Name: Guyana, Code: GY, Number Of Holidays: 11
46, Name: Haiti, Code: HT, Number Of Holidays: 20
47, Name: Holy See (Vatican City State), Code: VA, Number Of Holidays: 15
48, Name: Honduras, Code: HN, Number Of Holidays: 11
49, Name: Hungary, Code: HU, Number Of Holidays: 13
50, Name: Iceland, Code: IS, Number Of Holidays: 16
51, Name: Indonesia, Code: ID, Number Of Holidays: 8
52, Name: Ireland, Code: IE, Number Of Holidays: 10
53, Name: Isle of Man, Code: IM, Number Of Holidays: 11
54, Name: Italy, Code: IT, Number Of Holidays: 12
55, Name: Jamaica, Code: JM, Number Of Holidays: 10
56, Name: Japan, Code: JP, Number Of Holidays: 16
57, Name: Jersey, Code: JE, Number Of Holidays: 9
58, Name: Korea, Republic of, Code: KR, Number Of Holidays: 15
59, Name: Latvia, Code: LV, Number Of Holidays: 14
60, Name: Lesotho, Code: LS, Number Of Holidays: 11
61, Name: Liechtenstein, Code: LI, Number Of Holidays: 19
62, Name: Lithuania, Code: LT, Number Of Holidays: 14
63, Name: Luxembourg, Code: LU, Number Of Holidays: 12
64, Name: Macedonia, the Former Yugoslav Republic of, Code: MK, Number Of Holidays: 12
65, Name: Madagascar, Code: MG, Number Of Holidays: 10
66, Name: Malta, Code: MT, Number Of Holidays: 14
67, Name: Mexico, Code: MX, Number Of Holidays: 7
68, Name: Moldova, Republic of, Code: MD, Number Of Holidays: 16
69, Name: Monaco, Code: MC, Number Of Holidays: 12
70, Name: Mongolia, Code: MN, Number Of Holidays: 10
71, Name: Montenegro, Code: ME, Number Of Holidays: 20
72, Name: Montserrat, Code: MS, Number Of Holidays: 11
73, Name: Morocco, Code: MA, Number Of Holidays: 9
74, Name: Mozambique, Code: MZ, Number Of Holidays: 9
75, Name: Namibia, Code: NA, Number Of Holidays: 12
76, Name: Netherlands, Code: NL, Number Of Holidays: 11
77, Name: New Zealand, Code: NZ, Number Of Holidays: 23
78, Name: Nicaragua, Code: NI, Number Of Holidays: 12
79, Name: Niger, Code: NE, Number Of Holidays: 7
80, Name: Nigeria, Code: NG, Number Of Holidays: 10
81, Name: Norway, Code: NO, Number Of Holidays: 12
82, Name: Panama, Code: PA, Number Of Holidays: 13
83, Name: Papua New Guinea, Code: PG, Number Of Holidays: 11
84, Name: Paraguay, Code: PY, Number Of Holidays: 12
85, Name: Peru, Code: PE, Number Of Holidays: 13
86, Name: Poland, Code: PL, Number Of Holidays: 13
87, Name: Portugal, Code: PT, Number Of Holidays: 17
88, Name: Puerto Rico, Code: PR, Number Of Holidays: 21
89, Name: Romania, Code: RO, Number Of Holidays: 15
90, Name: Russian Federation, Code: RU, Number Of Holidays: 13
91, Name: San Marino, Code: SM, Number Of Holidays: 18
92, Name: Serbia, Code: RS, Number Of Holidays: 11
93, Name: Singapore, Code: SG, Number Of Holidays: 7
94, Name: Slovakia, Code: SK, Number Of Holidays: 15
95, Name: Slovenia, Code: SI, Number Of Holidays: 15
96, Name: South Africa, Code: ZA, Number Of Holidays: 12
97, Name: Spain, Code: ES, Number Of Holidays: 36
98, Name: Suriname, Code: SR, Number Of Holidays: 18
99, Name: Svalbard and Jan Mayen, Code: SJ, Number Of Holidays: 12
100, Name: Sweden, Code: SE, Number Of Holidays: 16
101, Name: Switzerland, Code: CH, Number Of Holidays: 19
102, Name: Tunisia, Code: TN, Number Of Holidays: 9
103, Name: Turkey, Code: TR, Number Of Holidays: 7
104, Name: Ukraine, Code: UA, Number Of Holidays: 11
105, Name: United Kingdom, Code: GB, Number Of Holidays: 17
106, Name: United States, Code: US, Number Of Holidays: 13
107, Name: Uruguay, Code: UY, Number Of Holidays: 15
108, Name: Venezuela, Bolivarian Republic of, Code: VE, Number Of Holidays: 38
109, Name: Vietnam, Code: VN, Number Of Holidays: 4
110, Name: Zimbabwe, Code: ZW, Number Of Holidays: 13

 Number of Countries :110
Minimum Holidays Countries  : 
109 , Name: Vietnam, Code: VN, Number Of Holidays: 4

3 , Name: Andorra, Code: AD, Number Of Holidays: 4

Maximum Holidays Countries : 
108 , Name: Venezuela, Bolivarian Republic of, Code: VE, Number Of Holidays: 38


Process finished with exit code 0


 ``` 
