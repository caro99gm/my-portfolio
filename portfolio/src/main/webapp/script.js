// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random fact to the page.
 */
function addRandomFact() {
    const Facts =
        ['My hair have change color by its own', 'My favorite movie is How to Train your Dragon', 'I speak Spanish, English, German and French', 'I love travelling', 'My favorite color is blue', 'I have a cat and a dog', 'My favorite Nintendo character is Yoshi', 'I love The Legend of Zelda'];
  
    // Pick a random fact.
    const fact = Facts[Math.floor(Math.random() * Facts.length)];
  
    // Add it to the page.
    const factContainer = document.getElementById('fact-container');
    factContainer.innerText = fact;
  }
