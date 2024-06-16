import React, {userState} from "react";
import {View, Image} from 'react-native';

import styles from '../styles/MainStyle';

import logo from '../assets/images/PJournal_logo';

export default function Main({ navigation }) {


    // HTML part
    return (
        <View style={styles.main}>
            <Image source={logo} style={styles.logo}/>
        </View>
    )
}