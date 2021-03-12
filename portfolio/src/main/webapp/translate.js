async function translateText() {
  const text = document.getElementById('translate-container').innerHTML;
  const language = document.getElementById('language').value;

  const params = new URLSearchParams();
  params.append('text', text);
  params.append('language', language);
  const responseFromServer = await fetch('/translate', {method: "POST", body: params});
    
  const result = document.getElementById('translate-container');

  result.innerHTML = await responseFromServer.text();
}
 