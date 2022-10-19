import React from 'react';
import type {Node} from 'react';
import {
  SafeAreaView,
  StyleSheet,
  Text
} from 'react-native';
import { MapView } from './MapView';

const App: () => Node = () => {
  return (
    <SafeAreaView style={styles.container}>
      <MapView style={styles.mapContainer}/>
      <Text>Halik</Text>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex:1,
    justifyContent:'center',
    alignItems:'center'
  },
  mapContainer: {
    height:'100%',
    width:'100%',
  }
});

export default App;
