async function showWelcome() {
  const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.text();

  const helloContainer = document.getElementById('hello-container');
  helloContainer.innerText = textFromResponse;
}
