async function showWelcome() {
  const responseFromServer = await fetch('/hello');
  const object = await responseFromServer.json();
  console.log(object);
  const welcome = object.randomFunction;

  const hello = document.getElementById('hello-container');
  hello.innerText = welcome;
}

