import React from 'react';
import { Text, View, StyleSheet } from 'react-native';
import {RNCamera} from 'react-native-camera';

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
      <RNCamera
        style={{width: 200, height: 300}}
        type={RNCamera.Constants.Type.back}
        captureAudio={false}
        />
    </View>
    
  );
}