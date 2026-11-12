.class public final synthetic Lt5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lt5;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lt5;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string p0, "LocalTextToolbar"

    .line 9
    .line 10
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v1

    .line 14
    :pswitch_0
    const-string p0, "LocalProvidableLocaleList"

    .line 15
    .line 16
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v1

    .line 20
    :pswitch_1
    const-string p0, "LocalLayoutDirection"

    .line 21
    .line 22
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :pswitch_2
    const-string p0, "LocalInputManager"

    .line 27
    .line 28
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :pswitch_3
    const-string p0, "LocalHapticFeedback"

    .line 33
    .line 34
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :pswitch_4
    const-string p0, "LocalFontFamilyResolver"

    .line 39
    .line 40
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :pswitch_5
    const-string p0, "LocalFontLoader"

    .line 45
    .line 46
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :pswitch_6
    const-string p0, "LocalFocusManager"

    .line 51
    .line 52
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :pswitch_7
    const-string p0, "LocalDensity"

    .line 57
    .line 58
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :pswitch_8
    const-string p0, "LocalGraphicsContext"

    .line 63
    .line 64
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :pswitch_9
    const-string p0, "LocalClipboard"

    .line 69
    .line 70
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :pswitch_a
    const-string p0, "LocalClipboardManager"

    .line 75
    .line 76
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :pswitch_b
    const-string p0, "LocalAutofillManager"

    .line 81
    .line 82
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :pswitch_c
    const-string p0, "LocalAutofillTree"

    .line 87
    .line 88
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :pswitch_d
    sget-object p0, Lg90;->a:Lwl4;

    .line 93
    .line 94
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_e
    new-instance p0, Lf90;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_f
    sget-object p0, Lg90;->a:Lwl4;

    .line 104
    .line 105
    return-object v1

    .line 106
    :pswitch_10
    sget-object p0, Ly80;->a:Lwl4;

    .line 107
    .line 108
    return-object v1

    .line 109
    :pswitch_11
    sget-object p0, Lb00;->a:Lb00;

    .line 110
    .line 111
    sget-object p0, Lb00;->b:Lrp4;

    .line 112
    .line 113
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Landroid/content/SharedPreferences;

    .line 118
    .line 119
    const-string v0, "queue"

    .line 120
    .line 121
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_12
    new-instance p0, Lzz;

    .line 127
    .line 128
    sget-object v1, Lb00;->a:Lb00;

    .line 129
    .line 130
    sget-object v1, Lb00;->c:Lrp4;

    .line 131
    .line 132
    invoke-virtual {v1}, Lrp4;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Lwz;

    .line 137
    .line 138
    new-instance v2, Lk2;

    .line 139
    .line 140
    const/16 v3, 0x8

    .line 141
    .line 142
    invoke-direct {v2, v3, v0}, Lk2;-><init>(IB)V

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v1, v2}, Lzz;-><init>(Lwz;Lk2;)V

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_13
    new-instance p0, Lwz;

    .line 150
    .line 151
    new-instance v1, Lt5;

    .line 152
    .line 153
    const/16 v2, 0xb

    .line 154
    .line 155
    invoke-direct {v1, v2}, Lt5;-><init>(I)V

    .line 156
    .line 157
    .line 158
    new-instance v2, Lk2;

    .line 159
    .line 160
    const/4 v3, 0x7

    .line 161
    invoke-direct {v2, v3, v0}, Lk2;-><init>(IB)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p0, v1, v2}, Lwz;-><init>(Lt5;Lk2;)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_14
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    const-string v1, "homemusic_catalog_commands"

    .line 173
    .line 174
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :pswitch_15
    sget-object p0, Lnr;->a:Lwl4;

    .line 180
    .line 181
    return-object v1

    .line 182
    :pswitch_16
    new-instance p0, Lbd;

    .line 183
    .line 184
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    if-ne v2, v3, :cond_0

    .line 193
    .line 194
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    goto :goto_0

    .line 199
    :cond_0
    sget-object v2, Lrr0;->a:Lrm0;

    .line 200
    .line 201
    sget-object v2, Luf2;->a:Lfl1;

    .line 202
    .line 203
    new-instance v3, Lyc;

    .line 204
    .line 205
    const/4 v4, 0x2

    .line 206
    invoke-direct {v3, v4, v1, v0}, Lyc;-><init>(ILvd0;I)V

    .line 207
    .line 208
    .line 209
    invoke-static {v2, v3}, Lfu;->L(Lne0;Lwf1;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Landroid/view/Choreographer;

    .line 214
    .line 215
    :goto_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-static {v1}, Lwr1;->m(Landroid/os/Looper;)Landroid/os/Handler;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-direct {p0, v0, v1}, Lbd;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, Lbd;->y:Led;

    .line 227
    .line 228
    invoke-static {p0, v0}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_17
    const-string p0, "LocalView"

    .line 234
    .line 235
    invoke-static {p0}, Lhb;->a(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v1

    .line 239
    :pswitch_18
    const-string p0, "LocalResourceIdCache"

    .line 240
    .line 241
    invoke-static {p0}, Lhb;->a(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :pswitch_19
    const-string p0, "LocalImageVectorCache"

    .line 246
    .line 247
    invoke-static {p0}, Lhb;->a(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v1

    .line 251
    :pswitch_1a
    const-string p0, "LocalContext"

    .line 252
    .line 253
    invoke-static {p0}, Lhb;->a(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :pswitch_1b
    const-string p0, "LocalConfiguration"

    .line 258
    .line 259
    invoke-static {p0}, Lhb;->a(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v1

    .line 263
    :pswitch_1c
    const/high16 p0, 0x7fff0000

    .line 264
    .line 265
    sget-object v0, Lku3;->o:Lz1;

    .line 266
    .line 267
    invoke-virtual {v0, p0}, Lz1;->a(I)I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    const/high16 v0, 0x10000

    .line 272
    .line 273
    add-int/2addr p0, v0

    .line 274
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
