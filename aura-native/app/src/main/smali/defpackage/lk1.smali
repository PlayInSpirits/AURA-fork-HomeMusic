.class public final Ldefpackage/lk1;
.super Ldefpackage/bz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/lk1;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static c(ILdefpackage/l32;)Ldefpackage/h32;
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/xa3;->w(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ldefpackage/l32;->a0()V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ldefpackage/i32;->n:Ldefpackage/i32;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-static {p0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "Unexpected token: "

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    new-instance p0, Ldefpackage/k32;

    .line 40
    .line 41
    invoke-virtual {p1}, Ldefpackage/l32;->R()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p0, p1}, Ldefpackage/k32;-><init>(Ljava/lang/Boolean;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-virtual {p1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance p1, Ldefpackage/k32;

    .line 58
    .line 59
    new-instance v0, Ldefpackage/q72;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Ldefpackage/q72;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, v0}, Ldefpackage/k32;-><init>(Ljava/lang/Number;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    new-instance p0, Ldefpackage/k32;

    .line 69
    .line 70
    invoke-virtual {p1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ldefpackage/k32;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p0
.end method

.method public static d(Ldefpackage/q32;Ldefpackage/h32;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    instance-of v0, p1, Ldefpackage/i32;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Ldefpackage/k32;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    check-cast p1, Ldefpackage/k32;

    .line 14
    .line 15
    iget-object v0, p1, Ldefpackage/k32;->n:Ljava/io/Serializable;

    .line 16
    .line 17
    instance-of v1, v0, Ljava/lang/Number;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ldefpackage/k32;->e()Ljava/lang/Number;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Ldefpackage/k32;->d()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Ldefpackage/q32;->X(Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-virtual {p1}, Ldefpackage/k32;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    instance-of v0, p1, Ldefpackage/f32;

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0}, Ldefpackage/q32;->f()V

    .line 54
    .line 55
    .line 56
    check-cast p1, Ldefpackage/f32;

    .line 57
    .line 58
    iget-object p1, p1, Ldefpackage/f32;->n:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_0
    if-ge v1, v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    check-cast v2, Ldefpackage/h32;

    .line 74
    .line 75
    invoke-static {p0, v2}, Ldefpackage/lk1;->d(Ldefpackage/q32;Ldefpackage/h32;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    invoke-virtual {p0}, Ldefpackage/q32;->q()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    instance-of v0, p1, Ldefpackage/j32;

    .line 84
    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    invoke-virtual {p0}, Ldefpackage/q32;->j()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ldefpackage/h32;->a()Ldefpackage/j32;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object p1, p1, Ldefpackage/j32;->n:Ldefpackage/nb2;

    .line 95
    .line 96
    invoke-virtual {p1}, Ldefpackage/nb2;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Ldefpackage/lb2;

    .line 101
    .line 102
    invoke-virtual {p1}, Ldefpackage/lb2;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_1
    move-object v0, p1

    .line 107
    check-cast v0, Ldefpackage/kb2;

    .line 108
    .line 109
    invoke-virtual {v0}, Ldefpackage/kb2;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    move-object v0, p1

    .line 116
    check-cast v0, Ldefpackage/kb2;

    .line 117
    .line 118
    invoke-virtual {v0}, Ldefpackage/kb2;->b()Ldefpackage/mb2;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ldefpackage/h32;

    .line 136
    .line 137
    invoke-static {p0, v0}, Ldefpackage/lk1;->d(Ldefpackage/q32;Ldefpackage/h32;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    invoke-virtual {p0}, Ldefpackage/q32;->s()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_7
    const-string p0, "Couldn\'t write "

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1, p0}, Ldefpackage/kf2;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 156
    .line 157
    .line 158
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/l32;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ldefpackage/lk1;->a:I

    .line 6
    .line 7
    const-string v2, "null"

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x5

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x6

    .line 13
    const-string v7, "Lossy conversion from "

    .line 14
    .line 15
    const-string v8, "Failed parsing \'"

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x0

    .line 19
    const/16 v11, 0x9

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v11, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Ldefpackage/l32;->W()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    return-object v12

    .line 44
    :catch_0
    move-exception v0

    .line 45
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :pswitch_0
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-ne v0, v11, :cond_1

    .line 56
    .line 57
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ldefpackage/l32;->W()I

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    const v2, 0xffff

    .line 66
    .line 67
    .line 68
    if-gt v0, v2, :cond_2

    .line 69
    .line 70
    const/16 v2, -0x8000

    .line 71
    .line 72
    if-lt v0, v2, :cond_2

    .line 73
    .line 74
    int-to-short v0, v0

    .line 75
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    :goto_1
    return-object v12

    .line 80
    :cond_2
    new-instance v2, Lcom/google/gson/JsonSyntaxException;

    .line 81
    .line 82
    const-string v3, " to short; at path "

    .line 83
    .line 84
    invoke-static {v0, v7, v3}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v2

    .line 103
    :catch_1
    move-exception v0

    .line 104
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 105
    .line 106
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :pswitch_1
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-ne v0, v11, :cond_3

    .line 115
    .line 116
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Ldefpackage/l32;->W()I

    .line 121
    .line 122
    .line 123
    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 124
    const/16 v2, 0xff

    .line 125
    .line 126
    if-gt v0, v2, :cond_4

    .line 127
    .line 128
    const/16 v2, -0x80

    .line 129
    .line 130
    if-lt v0, v2, :cond_4

    .line 131
    .line 132
    int-to-byte v0, v0

    .line 133
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    :goto_2
    return-object v12

    .line 138
    :cond_4
    new-instance v2, Lcom/google/gson/JsonSyntaxException;

    .line 139
    .line 140
    const-string v3, " to byte; at path "

    .line 141
    .line 142
    invoke-static {v0, v7, v3}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v2

    .line 161
    :catch_2
    move-exception v0

    .line 162
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 163
    .line 164
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :pswitch_2
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-ne v0, v11, :cond_5

    .line 173
    .line 174
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_5
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    :goto_3
    return-object v12

    .line 187
    :pswitch_3
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-ne v0, v11, :cond_6

    .line 192
    .line 193
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    if-ne v0, v6, :cond_7

    .line 198
    .line 199
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    goto :goto_4

    .line 212
    :cond_7
    invoke-virtual {v1}, Ldefpackage/l32;->R()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    :goto_4
    return-object v12

    .line 221
    :pswitch_4
    new-instance v0, Ljava/util/BitSet;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Ldefpackage/l32;->b()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    move v3, v10

    .line 234
    :goto_5
    if-eq v2, v5, :cond_d

    .line 235
    .line 236
    invoke-static {v2}, Ldefpackage/xa3;->w(I)I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-eq v7, v4, :cond_9

    .line 241
    .line 242
    if-eq v7, v6, :cond_9

    .line 243
    .line 244
    const/4 v8, 0x7

    .line 245
    if-ne v7, v8, :cond_8

    .line 246
    .line 247
    invoke-virtual {v1}, Ldefpackage/l32;->R()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    goto :goto_6

    .line 252
    :cond_8
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 253
    .line 254
    invoke-static {v2}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v1}, Ldefpackage/l32;->v()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    new-instance v3, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v4, "Invalid bitset value type: "

    .line 265
    .line 266
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v2, "; at path "

    .line 273
    .line 274
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_9
    invoke-virtual {v1}, Ldefpackage/l32;->W()I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-nez v2, :cond_a

    .line 293
    .line 294
    move v2, v10

    .line 295
    goto :goto_6

    .line 296
    :cond_a
    if-ne v2, v9, :cond_c

    .line 297
    .line 298
    move v2, v9

    .line 299
    :goto_6
    if-eqz v2, :cond_b

    .line 300
    .line 301
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    .line 302
    .line 303
    .line 304
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 305
    .line 306
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    goto :goto_5

    .line 311
    :cond_c
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 312
    .line 313
    const-string v3, "Invalid bitset value "

    .line 314
    .line 315
    const-string v4, ", expected 0 or 1; at path "

    .line 316
    .line 317
    invoke-static {v2, v3, v4}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v0

    .line 336
    :cond_d
    invoke-virtual {v1}, Ldefpackage/l32;->q()V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_5
    instance-of v0, v1, Ldefpackage/n32;

    .line 341
    .line 342
    if-eqz v0, :cond_f

    .line 343
    .line 344
    move-object v0, v1

    .line 345
    check-cast v0, Ldefpackage/n32;

    .line 346
    .line 347
    invoke-virtual {v0}, Ldefpackage/n32;->e0()I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-eq v1, v4, :cond_e

    .line 352
    .line 353
    if-eq v1, v5, :cond_e

    .line 354
    .line 355
    if-eq v1, v3, :cond_e

    .line 356
    .line 357
    const/16 v2, 0xa

    .line 358
    .line 359
    if-eq v1, v2, :cond_e

    .line 360
    .line 361
    invoke-virtual {v0}, Ldefpackage/n32;->q0()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    move-object v12, v1

    .line 366
    check-cast v12, Ldefpackage/h32;

    .line 367
    .line 368
    invoke-virtual {v0}, Ldefpackage/n32;->k0()V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_e

    .line 372
    .line 373
    :cond_e
    invoke-static {v1}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    const-string v1, " when reading a JsonElement."

    .line 378
    .line 379
    const-string v2, "Unexpected "

    .line 380
    .line 381
    invoke-static {v0, v1, v2}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_e

    .line 385
    .line 386
    :cond_f
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    if-eqz v2, :cond_11

    .line 395
    .line 396
    if-eq v2, v5, :cond_10

    .line 397
    .line 398
    move-object v2, v12

    .line 399
    goto :goto_7

    .line 400
    :cond_10
    invoke-virtual {v1}, Ldefpackage/l32;->f()V

    .line 401
    .line 402
    .line 403
    new-instance v2, Ldefpackage/j32;

    .line 404
    .line 405
    invoke-direct {v2}, Ldefpackage/j32;-><init>()V

    .line 406
    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_11
    invoke-virtual {v1}, Ldefpackage/l32;->b()V

    .line 410
    .line 411
    .line 412
    new-instance v2, Ldefpackage/f32;

    .line 413
    .line 414
    invoke-direct {v2}, Ldefpackage/f32;-><init>()V

    .line 415
    .line 416
    .line 417
    :goto_7
    if-nez v2, :cond_12

    .line 418
    .line 419
    invoke-static {v0, v1}, Ldefpackage/lk1;->c(ILdefpackage/l32;)Ldefpackage/h32;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    goto/16 :goto_e

    .line 424
    .line 425
    :cond_12
    new-instance v0, Ljava/util/ArrayDeque;

    .line 426
    .line 427
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 428
    .line 429
    .line 430
    :cond_13
    :goto_8
    invoke-virtual {v1}, Ldefpackage/l32;->J()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_1a

    .line 435
    .line 436
    instance-of v3, v2, Ldefpackage/j32;

    .line 437
    .line 438
    if-eqz v3, :cond_14

    .line 439
    .line 440
    invoke-virtual {v1}, Ldefpackage/l32;->Y()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    goto :goto_9

    .line 445
    :cond_14
    move-object v3, v12

    .line 446
    :goto_9
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    invoke-static {v4}, Ldefpackage/xa3;->w(I)I

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    if-eqz v6, :cond_16

    .line 455
    .line 456
    if-eq v6, v5, :cond_15

    .line 457
    .line 458
    move-object v6, v12

    .line 459
    goto :goto_a

    .line 460
    :cond_15
    invoke-virtual {v1}, Ldefpackage/l32;->f()V

    .line 461
    .line 462
    .line 463
    new-instance v6, Ldefpackage/j32;

    .line 464
    .line 465
    invoke-direct {v6}, Ldefpackage/j32;-><init>()V

    .line 466
    .line 467
    .line 468
    goto :goto_a

    .line 469
    :cond_16
    invoke-virtual {v1}, Ldefpackage/l32;->b()V

    .line 470
    .line 471
    .line 472
    new-instance v6, Ldefpackage/f32;

    .line 473
    .line 474
    invoke-direct {v6}, Ldefpackage/f32;-><init>()V

    .line 475
    .line 476
    .line 477
    :goto_a
    if-eqz v6, :cond_17

    .line 478
    .line 479
    move v7, v9

    .line 480
    goto :goto_b

    .line 481
    :cond_17
    move v7, v10

    .line 482
    :goto_b
    if-nez v6, :cond_18

    .line 483
    .line 484
    invoke-static {v4, v1}, Ldefpackage/lk1;->c(ILdefpackage/l32;)Ldefpackage/h32;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    :cond_18
    instance-of v4, v2, Ldefpackage/f32;

    .line 489
    .line 490
    if-eqz v4, :cond_19

    .line 491
    .line 492
    move-object v3, v2

    .line 493
    check-cast v3, Ldefpackage/f32;

    .line 494
    .line 495
    iget-object v3, v3, Ldefpackage/f32;->n:Ljava/util/ArrayList;

    .line 496
    .line 497
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    goto :goto_c

    .line 501
    :cond_19
    move-object v4, v2

    .line 502
    check-cast v4, Ldefpackage/j32;

    .line 503
    .line 504
    iget-object v4, v4, Ldefpackage/j32;->n:Ldefpackage/nb2;

    .line 505
    .line 506
    invoke-virtual {v4, v3, v6}, Ldefpackage/nb2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    :goto_c
    if-eqz v7, :cond_13

    .line 510
    .line 511
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    move-object v2, v6

    .line 515
    goto :goto_8

    .line 516
    :cond_1a
    instance-of v3, v2, Ldefpackage/f32;

    .line 517
    .line 518
    if-eqz v3, :cond_1b

    .line 519
    .line 520
    invoke-virtual {v1}, Ldefpackage/l32;->q()V

    .line 521
    .line 522
    .line 523
    goto :goto_d

    .line 524
    :cond_1b
    invoke-virtual {v1}, Ldefpackage/l32;->s()V

    .line 525
    .line 526
    .line 527
    :goto_d
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-eqz v3, :cond_1c

    .line 532
    .line 533
    move-object v12, v2

    .line 534
    :goto_e
    return-object v12

    .line 535
    :cond_1c
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    check-cast v2, Ldefpackage/h32;

    .line 540
    .line 541
    goto :goto_8

    .line 542
    :pswitch_6
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-ne v0, v11, :cond_1d

    .line 547
    .line 548
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 549
    .line 550
    .line 551
    goto :goto_11

    .line 552
    :cond_1d
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    new-instance v1, Ljava/util/StringTokenizer;

    .line 557
    .line 558
    const-string v2, "_"

    .line 559
    .line 560
    invoke-direct {v1, v0, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-eqz v0, :cond_1e

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    goto :goto_f

    .line 574
    :cond_1e
    move-object v0, v12

    .line 575
    :goto_f
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-eqz v2, :cond_1f

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    goto :goto_10

    .line 586
    :cond_1f
    move-object v2, v12

    .line 587
    :goto_10
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-eqz v3, :cond_20

    .line 592
    .line 593
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v12

    .line 597
    :cond_20
    if-nez v2, :cond_21

    .line 598
    .line 599
    if-nez v12, :cond_21

    .line 600
    .line 601
    new-instance v12, Ljava/util/Locale;

    .line 602
    .line 603
    invoke-direct {v12, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto :goto_11

    .line 607
    :cond_21
    if-nez v12, :cond_22

    .line 608
    .line 609
    new-instance v12, Ljava/util/Locale;

    .line 610
    .line 611
    invoke-direct {v12, v0, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_22
    new-instance v1, Ljava/util/Locale;

    .line 616
    .line 617
    invoke-direct {v1, v0, v2, v12}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    move-object v12, v1

    .line 621
    :goto_11
    return-object v12

    .line 622
    :pswitch_7
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-ne v0, v11, :cond_23

    .line 627
    .line 628
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_13

    .line 632
    .line 633
    :cond_23
    invoke-virtual {v1}, Ldefpackage/l32;->f()V

    .line 634
    .line 635
    .line 636
    move v14, v10

    .line 637
    move v15, v14

    .line 638
    move/from16 v16, v15

    .line 639
    .line 640
    move/from16 v17, v16

    .line 641
    .line 642
    move/from16 v18, v17

    .line 643
    .line 644
    move/from16 v19, v18

    .line 645
    .line 646
    :cond_24
    :goto_12
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    if-eq v0, v3, :cond_2a

    .line 651
    .line 652
    invoke-virtual {v1}, Ldefpackage/l32;->Y()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v1}, Ldefpackage/l32;->W()I

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    const-string v4, "year"

    .line 661
    .line 662
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    if-eqz v4, :cond_25

    .line 667
    .line 668
    move v14, v2

    .line 669
    goto :goto_12

    .line 670
    :cond_25
    const-string v4, "month"

    .line 671
    .line 672
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    if-eqz v4, :cond_26

    .line 677
    .line 678
    move v15, v2

    .line 679
    goto :goto_12

    .line 680
    :cond_26
    const-string v4, "dayOfMonth"

    .line 681
    .line 682
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    if-eqz v4, :cond_27

    .line 687
    .line 688
    move/from16 v16, v2

    .line 689
    .line 690
    goto :goto_12

    .line 691
    :cond_27
    const-string v4, "hourOfDay"

    .line 692
    .line 693
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v4

    .line 697
    if-eqz v4, :cond_28

    .line 698
    .line 699
    move/from16 v17, v2

    .line 700
    .line 701
    goto :goto_12

    .line 702
    :cond_28
    const-string v4, "minute"

    .line 703
    .line 704
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    if-eqz v4, :cond_29

    .line 709
    .line 710
    move/from16 v18, v2

    .line 711
    .line 712
    goto :goto_12

    .line 713
    :cond_29
    const-string v4, "second"

    .line 714
    .line 715
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-eqz v0, :cond_24

    .line 720
    .line 721
    move/from16 v19, v2

    .line 722
    .line 723
    goto :goto_12

    .line 724
    :cond_2a
    invoke-virtual {v1}, Ldefpackage/l32;->s()V

    .line 725
    .line 726
    .line 727
    new-instance v13, Ljava/util/GregorianCalendar;

    .line 728
    .line 729
    invoke-direct/range {v13 .. v19}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    .line 730
    .line 731
    .line 732
    move-object v12, v13

    .line 733
    :goto_13
    return-object v12

    .line 734
    :pswitch_8
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    :try_start_3
    invoke-static {v2}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 739
    .line 740
    .line 741
    move-result-object v12
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 742
    goto :goto_14

    .line 743
    :catch_3
    move-exception v0

    .line 744
    const-string v3, "\' as Currency; at path "

    .line 745
    .line 746
    invoke-static {v8, v2, v3}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-static {v2, v1, v0}, Ldefpackage/oi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 755
    .line 756
    .line 757
    :goto_14
    return-object v12

    .line 758
    :pswitch_9
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-ne v0, v11, :cond_2b

    .line 763
    .line 764
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 765
    .line 766
    .line 767
    goto :goto_15

    .line 768
    :cond_2b
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    :try_start_4
    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 773
    .line 774
    .line 775
    move-result-object v12
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 776
    goto :goto_15

    .line 777
    :catch_4
    move-exception v0

    .line 778
    const-string v3, "\' as UUID; at path "

    .line 779
    .line 780
    invoke-static {v8, v2, v3}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    invoke-static {v2, v1, v0}, Ldefpackage/oi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 789
    .line 790
    .line 791
    :goto_15
    return-object v12

    .line 792
    :pswitch_a
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    if-ne v0, v11, :cond_2c

    .line 797
    .line 798
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 799
    .line 800
    .line 801
    goto :goto_16

    .line 802
    :cond_2c
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 807
    .line 808
    .line 809
    move-result-object v12

    .line 810
    :goto_16
    return-object v12

    .line 811
    :pswitch_b
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 812
    .line 813
    .line 814
    move-result v0

    .line 815
    if-ne v0, v11, :cond_2d

    .line 816
    .line 817
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 818
    .line 819
    .line 820
    goto :goto_17

    .line 821
    :cond_2d
    :try_start_5
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    if-eqz v1, :cond_2e

    .line 830
    .line 831
    goto :goto_17

    .line 832
    :cond_2e
    new-instance v12, Ljava/net/URI;

    .line 833
    .line 834
    invoke-direct {v12, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/net/URISyntaxException; {:try_start_5 .. :try_end_5} :catch_5

    .line 835
    .line 836
    .line 837
    :goto_17
    return-object v12

    .line 838
    :catch_5
    move-exception v0

    .line 839
    new-instance v1, Lcom/google/gson/JsonIOException;

    .line 840
    .line 841
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 842
    .line 843
    .line 844
    throw v1

    .line 845
    :pswitch_c
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 846
    .line 847
    .line 848
    move-result v0

    .line 849
    if-ne v0, v11, :cond_2f

    .line 850
    .line 851
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 852
    .line 853
    .line 854
    goto :goto_18

    .line 855
    :cond_2f
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    if-eqz v1, :cond_30

    .line 864
    .line 865
    goto :goto_18

    .line 866
    :cond_30
    new-instance v12, Ljava/net/URL;

    .line 867
    .line 868
    invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    :goto_18
    return-object v12

    .line 872
    :pswitch_d
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    if-ne v0, v11, :cond_31

    .line 877
    .line 878
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 879
    .line 880
    .line 881
    goto :goto_19

    .line 882
    :cond_31
    new-instance v12, Ljava/lang/StringBuffer;

    .line 883
    .line 884
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-direct {v12, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    :goto_19
    return-object v12

    .line 892
    :pswitch_e
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 893
    .line 894
    const-string v1, "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?"

    .line 895
    .line 896
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    throw v0

    .line 900
    :pswitch_f
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    if-ne v0, v11, :cond_32

    .line 905
    .line 906
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 907
    .line 908
    .line 909
    goto :goto_1a

    .line 910
    :cond_32
    new-instance v12, Ljava/lang/StringBuilder;

    .line 911
    .line 912
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    :goto_1a
    return-object v12

    .line 920
    :pswitch_10
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    if-ne v0, v11, :cond_33

    .line 925
    .line 926
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 927
    .line 928
    .line 929
    goto :goto_1b

    .line 930
    :cond_33
    new-instance v12, Ldefpackage/q72;

    .line 931
    .line 932
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-direct {v12, v0}, Ldefpackage/q72;-><init>(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    :goto_1b
    return-object v12

    .line 940
    :pswitch_11
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 941
    .line 942
    .line 943
    move-result v0

    .line 944
    if-ne v0, v11, :cond_34

    .line 945
    .line 946
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 947
    .line 948
    .line 949
    goto :goto_1c

    .line 950
    :cond_34
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    :try_start_6
    new-instance v0, Ljava/math/BigInteger;

    .line 955
    .line 956
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 957
    .line 958
    .line 959
    move-object v12, v0

    .line 960
    goto :goto_1c

    .line 961
    :catch_6
    move-exception v0

    .line 962
    const-string v3, "\' as BigInteger; at path "

    .line 963
    .line 964
    invoke-static {v8, v2, v3}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    invoke-static {v2, v1, v0}, Ldefpackage/oi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 973
    .line 974
    .line 975
    :goto_1c
    return-object v12

    .line 976
    :pswitch_12
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    if-ne v0, v11, :cond_35

    .line 981
    .line 982
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 983
    .line 984
    .line 985
    goto :goto_1d

    .line 986
    :cond_35
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    :try_start_7
    new-instance v0, Ljava/math/BigDecimal;

    .line 991
    .line 992
    invoke-direct {v0, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    .line 993
    .line 994
    .line 995
    move-object v12, v0

    .line 996
    goto :goto_1d

    .line 997
    :catch_7
    move-exception v0

    .line 998
    const-string v3, "\' as BigDecimal; at path "

    .line 999
    .line 1000
    invoke-static {v8, v2, v3}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-static {v2, v1, v0}, Ldefpackage/oi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 1009
    .line 1010
    .line 1011
    :goto_1d
    return-object v12

    .line 1012
    :pswitch_13
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    if-ne v0, v11, :cond_36

    .line 1017
    .line 1018
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_1e

    .line 1022
    :cond_36
    const/16 v2, 0x8

    .line 1023
    .line 1024
    if-ne v0, v2, :cond_37

    .line 1025
    .line 1026
    invoke-virtual {v1}, Ldefpackage/l32;->R()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v0

    .line 1030
    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v12

    .line 1034
    goto :goto_1e

    .line 1035
    :cond_37
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v12

    .line 1039
    :goto_1e
    return-object v12

    .line 1040
    :pswitch_14
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-ne v0, v11, :cond_38

    .line 1045
    .line 1046
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1047
    .line 1048
    .line 1049
    goto :goto_1f

    .line 1050
    :cond_38
    invoke-virtual {v1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    if-ne v2, v9, :cond_39

    .line 1059
    .line 1060
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 1061
    .line 1062
    .line 1063
    move-result v0

    .line 1064
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v12

    .line 1068
    :goto_1f
    return-object v12

    .line 1069
    :cond_39
    new-instance v2, Lcom/google/gson/JsonSyntaxException;

    .line 1070
    .line 1071
    const-string v3, "Expecting character, got: "

    .line 1072
    .line 1073
    const-string v4, "; at "

    .line 1074
    .line 1075
    invoke-static {v3, v0, v4}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-virtual {v1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    throw v2

    .line 1094
    :pswitch_15
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    if-ne v0, v11, :cond_3a

    .line 1099
    .line 1100
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1101
    .line 1102
    .line 1103
    goto :goto_20

    .line 1104
    :cond_3a
    invoke-virtual {v1}, Ldefpackage/l32;->T()D

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v0

    .line 1108
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v12

    .line 1112
    :goto_20
    return-object v12

    .line 1113
    :pswitch_16
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1114
    .line 1115
    .line 1116
    move-result v0

    .line 1117
    if-ne v0, v11, :cond_3b

    .line 1118
    .line 1119
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_21

    .line 1123
    :cond_3b
    invoke-virtual {v1}, Ldefpackage/l32;->T()D

    .line 1124
    .line 1125
    .line 1126
    move-result-wide v0

    .line 1127
    double-to-float v0, v0

    .line 1128
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v12

    .line 1132
    :goto_21
    return-object v12

    .line 1133
    :pswitch_17
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1134
    .line 1135
    .line 1136
    move-result v0

    .line 1137
    if-ne v0, v11, :cond_3c

    .line 1138
    .line 1139
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_22

    .line 1143
    :cond_3c
    :try_start_8
    invoke-virtual {v1}, Ldefpackage/l32;->X()J

    .line 1144
    .line 1145
    .line 1146
    move-result-wide v0

    .line 1147
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v12
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1151
    :goto_22
    return-object v12

    .line 1152
    :catch_8
    move-exception v0

    .line 1153
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 1154
    .line 1155
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1156
    .line 1157
    .line 1158
    throw v1

    .line 1159
    :pswitch_18
    new-instance v0, Ljava/util/ArrayList;

    .line 1160
    .line 1161
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v1}, Ldefpackage/l32;->b()V

    .line 1165
    .line 1166
    .line 1167
    :goto_23
    invoke-virtual {v1}, Ldefpackage/l32;->J()Z

    .line 1168
    .line 1169
    .line 1170
    move-result v2

    .line 1171
    if-eqz v2, :cond_3d

    .line 1172
    .line 1173
    :try_start_9
    invoke-virtual {v1}, Ldefpackage/l32;->W()I

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_9

    .line 1182
    .line 1183
    .line 1184
    goto :goto_23

    .line 1185
    :catch_9
    move-exception v0

    .line 1186
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 1187
    .line 1188
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1189
    .line 1190
    .line 1191
    throw v1

    .line 1192
    :cond_3d
    invoke-virtual {v1}, Ldefpackage/l32;->q()V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1196
    .line 1197
    .line 1198
    move-result v1

    .line 1199
    new-instance v2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 1200
    .line 1201
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    .line 1202
    .line 1203
    .line 1204
    :goto_24
    if-ge v10, v1, :cond_3e

    .line 1205
    .line 1206
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    check-cast v3, Ljava/lang/Integer;

    .line 1211
    .line 1212
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1213
    .line 1214
    .line 1215
    move-result v3

    .line 1216
    invoke-virtual {v2, v10, v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    .line 1217
    .line 1218
    .line 1219
    add-int/lit8 v10, v10, 0x1

    .line 1220
    .line 1221
    goto :goto_24

    .line 1222
    :cond_3e
    return-object v2

    .line 1223
    :pswitch_19
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    if-ne v0, v11, :cond_3f

    .line 1228
    .line 1229
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1230
    .line 1231
    .line 1232
    goto :goto_25

    .line 1233
    :cond_3f
    invoke-virtual {v1}, Ldefpackage/l32;->X()J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v0

    .line 1237
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v12

    .line 1241
    :goto_25
    return-object v12

    .line 1242
    :pswitch_1a
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    if-ne v0, v11, :cond_40

    .line 1247
    .line 1248
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1249
    .line 1250
    .line 1251
    goto :goto_26

    .line 1252
    :cond_40
    invoke-virtual {v1}, Ldefpackage/l32;->T()D

    .line 1253
    .line 1254
    .line 1255
    move-result-wide v0

    .line 1256
    double-to-float v0, v0

    .line 1257
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v12

    .line 1261
    :goto_26
    return-object v12

    .line 1262
    :pswitch_1b
    invoke-virtual {v1}, Ldefpackage/l32;->e0()I

    .line 1263
    .line 1264
    .line 1265
    move-result v0

    .line 1266
    if-ne v0, v11, :cond_41

    .line 1267
    .line 1268
    invoke-virtual {v1}, Ldefpackage/l32;->a0()V

    .line 1269
    .line 1270
    .line 1271
    goto :goto_27

    .line 1272
    :cond_41
    invoke-virtual {v1}, Ldefpackage/l32;->T()D

    .line 1273
    .line 1274
    .line 1275
    move-result-wide v0

    .line 1276
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v12

    .line 1280
    :goto_27
    return-object v12

    .line 1281
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final b(Ldefpackage/q32;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget p0, p0, Ldefpackage/lk1;->a:I

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
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-long v0, p0

    .line 21
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    int-to-long v0, p0

    .line 38
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 39
    .line 40
    .line 41
    :goto_1
    return-void

    .line 42
    :pswitch_1
    check-cast p2, Ljava/lang/Number;

    .line 43
    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    int-to-long v0, p0

    .line 55
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 56
    .line 57
    .line 58
    :goto_2
    return-void

    .line 59
    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    const-string p0, "null"

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_3
    invoke-virtual {p1, p0}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_3
    check-cast p2, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Ldefpackage/q32;->R(Ljava/lang/Boolean;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_4
    check-cast p2, Ljava/util/BitSet;

    .line 81
    .line 82
    invoke-virtual {p1}, Ldefpackage/q32;->f()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    :goto_4
    if-ge v0, p0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->get(I)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    int-to-long v1, v1

    .line 96
    invoke-virtual {p1, v1, v2}, Ldefpackage/q32;->M(J)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    invoke-virtual {p1}, Ldefpackage/q32;->q()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_5
    check-cast p2, Ldefpackage/h32;

    .line 107
    .line 108
    invoke-static {p1, p2}, Ldefpackage/lk1;->d(Ldefpackage/q32;Ldefpackage/h32;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_6
    check-cast p2, Ljava/util/Locale;

    .line 113
    .line 114
    if-nez p2, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :goto_5
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_7
    check-cast p2, Ljava/util/Calendar;

    .line 126
    .line 127
    if-nez p2, :cond_6

    .line 128
    .line 129
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 130
    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_6
    invoke-virtual {p1}, Ldefpackage/q32;->j()V

    .line 134
    .line 135
    .line 136
    const-string p0, "year"

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x1

    .line 142
    invoke-virtual {p2, p0}, Ljava/util/Calendar;->get(I)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    int-to-long v0, p0

    .line 147
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 148
    .line 149
    .line 150
    const-string p0, "month"

    .line 151
    .line 152
    invoke-virtual {p1, p0}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/4 p0, 0x2

    .line 156
    invoke-virtual {p2, p0}, Ljava/util/Calendar;->get(I)I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    int-to-long v0, p0

    .line 161
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 162
    .line 163
    .line 164
    const-string p0, "dayOfMonth"

    .line 165
    .line 166
    invoke-virtual {p1, p0}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/4 p0, 0x5

    .line 170
    invoke-virtual {p2, p0}, Ljava/util/Calendar;->get(I)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    int-to-long v0, p0

    .line 175
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 176
    .line 177
    .line 178
    const-string p0, "hourOfDay"

    .line 179
    .line 180
    invoke-virtual {p1, p0}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/16 p0, 0xb

    .line 184
    .line 185
    invoke-virtual {p2, p0}, Ljava/util/Calendar;->get(I)I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    int-to-long v0, p0

    .line 190
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 191
    .line 192
    .line 193
    const-string p0, "minute"

    .line 194
    .line 195
    invoke-virtual {p1, p0}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const/16 p0, 0xc

    .line 199
    .line 200
    invoke-virtual {p2, p0}, Ljava/util/Calendar;->get(I)I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    int-to-long v0, p0

    .line 205
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 206
    .line 207
    .line 208
    const-string p0, "second"

    .line 209
    .line 210
    invoke-virtual {p1, p0}, Ldefpackage/q32;->u(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const/16 p0, 0xd

    .line 214
    .line 215
    invoke-virtual {p2, p0}, Ljava/util/Calendar;->get(I)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    int-to-long v0, p0

    .line 220
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ldefpackage/q32;->s()V

    .line 224
    .line 225
    .line 226
    :goto_6
    return-void

    .line 227
    :pswitch_8
    check-cast p2, Ljava/util/Currency;

    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-virtual {p1, p0}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_9
    check-cast p2, Ljava/util/UUID;

    .line 238
    .line 239
    if-nez p2, :cond_7

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_7
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    :goto_7
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_a
    check-cast p2, Ljava/net/InetAddress;

    .line 251
    .line 252
    if-nez p2, :cond_8

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_8
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    :goto_8
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :pswitch_b
    check-cast p2, Ljava/net/URI;

    .line 264
    .line 265
    if-nez p2, :cond_9

    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_9
    invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    :goto_9
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_c
    check-cast p2, Ljava/net/URL;

    .line 277
    .line 278
    if-nez p2, :cond_a

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_a
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    :goto_a
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_d
    check-cast p2, Ljava/lang/StringBuffer;

    .line 290
    .line 291
    if-nez p2, :cond_b

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_b
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    :goto_b
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_e
    check-cast p2, Ljava/lang/Class;

    .line 303
    .line 304
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 305
    .line 306
    new-instance p1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v0, "Attempted to serialize java.lang.Class: "

    .line 309
    .line 310
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p2

    .line 317
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string p2, ". Forgot to register a type adapter?"

    .line 321
    .line 322
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p0

    .line 333
    :pswitch_f
    check-cast p2, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    if-nez p2, :cond_c

    .line 336
    .line 337
    goto :goto_c

    .line 338
    :cond_c
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    :goto_c
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :pswitch_10
    check-cast p2, Ldefpackage/q72;

    .line 347
    .line 348
    invoke-virtual {p1, p2}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :pswitch_11
    check-cast p2, Ljava/math/BigInteger;

    .line 353
    .line 354
    invoke-virtual {p1, p2}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_12
    check-cast p2, Ljava/math/BigDecimal;

    .line 359
    .line 360
    invoke-virtual {p1, p2}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :pswitch_13
    check-cast p2, Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {p1, p2}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :pswitch_14
    check-cast p2, Ljava/lang/Character;

    .line 371
    .line 372
    if-nez p2, :cond_d

    .line 373
    .line 374
    goto :goto_d

    .line 375
    :cond_d
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    :goto_d
    invoke-virtual {p1, v1}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :pswitch_15
    check-cast p2, Ljava/lang/Number;

    .line 384
    .line 385
    if-nez p2, :cond_e

    .line 386
    .line 387
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 388
    .line 389
    .line 390
    goto :goto_e

    .line 391
    :cond_e
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 392
    .line 393
    .line 394
    move-result-wide v0

    .line 395
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->K(D)V

    .line 396
    .line 397
    .line 398
    :goto_e
    return-void

    .line 399
    :pswitch_16
    check-cast p2, Ljava/lang/Number;

    .line 400
    .line 401
    if-nez p2, :cond_f

    .line 402
    .line 403
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 404
    .line 405
    .line 406
    goto :goto_10

    .line 407
    :cond_f
    instance-of p0, p2, Ljava/lang/Float;

    .line 408
    .line 409
    if-eqz p0, :cond_10

    .line 410
    .line 411
    goto :goto_f

    .line 412
    :cond_10
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 413
    .line 414
    .line 415
    move-result p0

    .line 416
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    :goto_f
    invoke-virtual {p1, p2}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 421
    .line 422
    .line 423
    :goto_10
    return-void

    .line 424
    :pswitch_17
    check-cast p2, Ljava/lang/Number;

    .line 425
    .line 426
    if-nez p2, :cond_11

    .line 427
    .line 428
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 429
    .line 430
    .line 431
    goto :goto_11

    .line 432
    :cond_11
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 433
    .line 434
    .line 435
    move-result-wide v0

    .line 436
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->M(J)V

    .line 437
    .line 438
    .line 439
    :goto_11
    return-void

    .line 440
    :pswitch_18
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 441
    .line 442
    invoke-virtual {p1}, Ldefpackage/q32;->f()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 446
    .line 447
    .line 448
    move-result p0

    .line 449
    :goto_12
    if-ge v0, p0, :cond_12

    .line 450
    .line 451
    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    int-to-long v1, v1

    .line 456
    invoke-virtual {p1, v1, v2}, Ldefpackage/q32;->M(J)V

    .line 457
    .line 458
    .line 459
    add-int/lit8 v0, v0, 0x1

    .line 460
    .line 461
    goto :goto_12

    .line 462
    :cond_12
    invoke-virtual {p1}, Ldefpackage/q32;->q()V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_19
    check-cast p2, Ljava/lang/Number;

    .line 467
    .line 468
    if-nez p2, :cond_13

    .line 469
    .line 470
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 471
    .line 472
    .line 473
    goto :goto_13

    .line 474
    :cond_13
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    invoke-virtual {p1, p0}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    :goto_13
    return-void

    .line 482
    :pswitch_1a
    check-cast p2, Ljava/lang/Number;

    .line 483
    .line 484
    if-nez p2, :cond_14

    .line 485
    .line 486
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 487
    .line 488
    .line 489
    goto :goto_15

    .line 490
    :cond_14
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 491
    .line 492
    .line 493
    move-result p0

    .line 494
    float-to-double v0, p0

    .line 495
    invoke-static {v0, v1}, Ldefpackage/nk1;->a(D)V

    .line 496
    .line 497
    .line 498
    instance-of v0, p2, Ljava/lang/Float;

    .line 499
    .line 500
    if-eqz v0, :cond_15

    .line 501
    .line 502
    goto :goto_14

    .line 503
    :cond_15
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 504
    .line 505
    .line 506
    move-result-object p2

    .line 507
    :goto_14
    invoke-virtual {p1, p2}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 508
    .line 509
    .line 510
    :goto_15
    return-void

    .line 511
    :pswitch_1b
    check-cast p2, Ljava/lang/Number;

    .line 512
    .line 513
    if-nez p2, :cond_16

    .line 514
    .line 515
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 516
    .line 517
    .line 518
    goto :goto_16

    .line 519
    :cond_16
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 520
    .line 521
    .line 522
    move-result-wide v0

    .line 523
    invoke-static {v0, v1}, Ldefpackage/nk1;->a(D)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {p1, v0, v1}, Ldefpackage/q32;->K(D)V

    .line 527
    .line 528
    .line 529
    :goto_16
    return-void

    .line 530
    nop

    .line 531
    :pswitch_data_0
    .packed-switch 0x0
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
