<script>

// JavaScript code for the approach

function search(pat, txt)
{
	/*finding lengths of strings pat and txt*/
	let n = txt.length, m = pat.length;
	/*string sortedpat stores the sorted version of pat*/
	let sortedpat = pat;
	sortedpat = sortedpat.split("").sort().join("");
	/*temp for storing the substring of length equal to
	* pat*/
	let temp;
	for (let i = 0; i <= n - m; i++) {
		temp = "";
		for (let k = i; k <br m + i; k++)
			temp += txt[k];
		temp = temp.split("").sort().join("");
		/*checking whether sorted versions are equal or
		* not*/
		if (sortedpat == temp)
			document.write("Found at Index ",i,"</br>");
	}
}

// driver code

let txt = "BACDGABCDA";
let pat = "ABCD";
search(pat, txt);




</script>
