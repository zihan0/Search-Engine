Search Engine using Apache Lucene

-Parsing the Cran and Queries
File docsCran.java is to parser the cran.all.1400 file into 1400 text files. Based on the flag that separate books and fields, each piece is saved into individual text files and named by its book number. 

qry.java parses the query file which contains all query and flagged. qry.java cleans up all extra letters and special characters, leaving only the content of queries. 

-Index all the books
IndexFiles.java is to index 1400 text files into field “content” and saved it to the folder “index”. 

-Search the Index
Making query for searching can be done by inputing from keyboard or simply link a query file. The search results are designed to fit the format that is required using Trec_eval.

Due to the nature of the text and difference between analyzers, this project implements EnglishAnalyzer().
As for scoring, BM25Similarity is slightly better than TFIDFSimilarity.

-Evaluation on the Search Results
The evaluation results without cutoff is pasted below.
<br>runid                 		all	STANDARD</br>
<br>num_q                 		all	225</br>
<br>num_ret               		all	193043</br>
<br>num_rel               		all	1837</br>
<br>num_rel_ret           		all	1736</br>
<br>map                   		all	0.3992</br>
<br>gm_map                		all	0.2724</br>
<br>Rprec                 		all	0.3738</br>
<br>bpref                 		all	0.9471</br>
<br>recip_rank            		all	0.7897</br>
<br>iprec_at_recall_0.00  	all	0.8050</br>
<br>iprec_at_recall_0.10  	all	0.7699</br>
<br>iprec_at_recall_0.20  	all	0.6630</br>
<br>iprec_at_recall_0.30  	all	0.5593</br>
<br>iprec_at_recall_0.40  	all	0.4587</br>
<br>iprec_at_recall_0.50  	all	0.4039</br>
<br>iprec_at_recall_0.60  	all	0.3065</br>
<br>iprec_at_recall_0.70  	all	0.2529</br>
<br>iprec_at_recall_0.80  	all	0.1832</br>
<br>iprec_at_recall_0.90  	all	0.1341</br>
<br>iprec_at_recall_1.00  	all	0.1187</br>
