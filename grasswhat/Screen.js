import React from 'react';
import { Text, View, StyleSheet } from 'react-native';

export default function App() {
  return (
    <View 
      style={{ 
        flex: 1, 
        justifyContent: 'center', 
        alignItems: 'center', 
        backgroundColor: '#D1F379'
      }}
    >
      <Text style={{fontSize: 20, fontWeight: 'bold'}}>Hello World! 🤓</Text>
    </View>
  );
}