import 'dart:async';
import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart' show rootBundle;
import 'package:app_lu_lu/component/log/Logs.dart';

class SupportedLocales {

  static Locale defaultLocale = const Locale('zh', 'CN'); // 中文简体

  static List<Locale> locales = [
    const Locale('en', 'US'), // 美国英语
    defaultLocale, // 中文简体
  ];
}
