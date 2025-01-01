# **Quran Explorer**  

This project is a digital tool designed to facilitate reading and learning the Quran with advanced search and data access features. It combines efficient data structures and a modern, user-friendly interface to provide a seamless experience for users.  
‎ 
## **Features**  

- ### **Search Functionalities**  
  - Search any Quranic ayah by its number.  
  - Look up entire surahs by selecting their names.  
  - Search ayahs and subtopics based on specific topics.  
  - Perform word-level searches across the entire Quran.  

- ### **Translations**  
  - Translations for each ayah are available in English and Urdu.  

- ### **Data Presentation**  
  - Quranic text is available in Arabic, English, and Urdu.    
‎ 
## **Technical Details**  

- ### **Data Structures**  
  - ### **Jagged/2D Arrays**  
    - The Quran’s structure is stored as a jagged array, where each of the 114 surahs is represented as an array containing its respective ayahs.  
    - Enables direct access to any ayah in constant time \(O(1)\).  

  - ### **Topic and Subtopic Search**  
    - Uses a node-type array linked with a linked list to handle variable-length ayah data for topics and subtopics.  
    - Offers direct and fast access, with search complexity \(O(n)\).  

  - ### **Word Search**  
    - Implemented using hashing on an ArrayList, optimized for search operations.    
‎ 
## **Performance**  

- ### **Big O Analysis**  
  - Ayah and surah search: \(O(1)\).  
  - Topic and subtopic search: \(O(n)\).  
  - Word search: \(O(n^2)\) due to loop-based hash value computations.    
‎ 
## **Data Source**  
The Quranic text and its translations were sourced from reliable databases such as [Tanzil.net](https://tanzil.net/download). For further help refer to the presentation and also the README.md file `/dist/README.md`
