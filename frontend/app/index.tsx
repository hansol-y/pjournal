import React, {useEffect} from 'react';
import { Text, View, Image, Button } from "react-native";
import { useRouter } from 'expo-router';
import * as Font from 'expo-font';

import logo from '../assets/images/logo.png';

export default function Index() {

  const loadFonts = async () => {
    await Font.loadAsync({
      'Carrara-Light': require('../assets/fonts/Carrara-Light.ttf')
    });
  }

  useEffect(() => {
    loadFonts();
  })

  const router = useRouter();

  return (
    <View
      style={{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      
      <Image 
        source={logo}
        style={{
          alignItems: "center",
          justifyContent: "center"
        }}></Image>
      <Text
        style={{
          fontSize: 25,
          margin: 20,
          fontFamily: 'Carrara-Light'
        }}
        >Snaps in Your Daily Life</Text>

      <Button 
        title='Register'
        onPress={() => router.push("../screens/Register")}
      />
      <Button 
        title='LogIn'
        onPress={() => router.push("../screens/LogIn")}
      />
    </View>
  );
}
