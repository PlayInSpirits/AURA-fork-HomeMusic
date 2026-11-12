.class public final Lrh5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lrh5;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lsh1;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lud3;->R0(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lsh1;->n:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lsh1;->o:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lsh1;->p:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lsh1;->q:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lsh1;->r:Landroid/os/IBinder;

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v2, 0x5

    .line 46
    invoke-static {p1, v2}, Lud3;->R0(Landroid/os/Parcel;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2}, Lud3;->S0(Landroid/os/Parcel;I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    const/4 v1, 0x6

    .line 57
    iget-object v2, p0, Lsh1;->s:[Lcom/google/android/gms/common/api/Scope;

    .line 58
    .line 59
    invoke-static {p1, v1, v2, p2}, Lud3;->P0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    iget-object v2, p0, Lsh1;->t:Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-static {p1, v1, v2}, Lud3;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    const/16 v1, 0x8

    .line 69
    .line 70
    iget-object v2, p0, Lsh1;->u:Landroid/accounts/Account;

    .line 71
    .line 72
    invoke-static {p1, v1, v2, p2}, Lud3;->M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 73
    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    iget-object v2, p0, Lsh1;->v:[Lp61;

    .line 78
    .line 79
    invoke-static {p1, v1, v2, p2}, Lud3;->P0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0xb

    .line 83
    .line 84
    iget-object v2, p0, Lsh1;->w:[Lp61;

    .line 85
    .line 86
    invoke-static {p1, v1, v2, p2}, Lud3;->P0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 87
    .line 88
    .line 89
    iget-boolean p2, p0, Lsh1;->x:Z

    .line 90
    .line 91
    const/16 v1, 0xc

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget p2, p0, Lsh1;->y:I

    .line 100
    .line 101
    const/16 v1, 0xd

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    iget-boolean p2, p0, Lsh1;->z:Z

    .line 110
    .line 111
    const/16 v1, 0xe

    .line 112
    .line 113
    invoke-static {p1, v1, v3}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    .line 118
    .line 119
    const/16 p2, 0xf

    .line 120
    .line 121
    iget-object p0, p0, Lsh1;->A:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p2, p0}, Lud3;->O0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v0}, Lud3;->S0(Landroid/os/Parcel;I)V

    .line 127
    .line 128
    .line 129
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lrh5;->a:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge v2, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-char v3, v2

    .line 32
    if-eq v3, v7, :cond_0

    .line 33
    .line 34
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ls61;

    .line 47
    .line 48
    invoke-direct {v0, v8}, Ls61;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :try_start_0
    invoke-static {v0}, Lc21;->a(I)Lc21;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/fido/fido2/api/common/ErrorCode$UnsupportedErrorCodeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-object v0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :pswitch_1
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ge v2, v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-char v3, v2

    .line 83
    if-eq v3, v6, :cond_2

    .line 84
    .line 85
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Luk5;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_2
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-ge v2, v0, :cond_5

    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    int-to-char v3, v2

    .line 117
    if-eq v3, v6, :cond_4

    .line 118
    .line 119
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    sget-object v3, Lqk5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 124
    .line 125
    invoke-static {v1, v2, v3}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    goto :goto_2

    .line 130
    :cond_5
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 131
    .line 132
    .line 133
    new-instance v0, Lrk5;

    .line 134
    .line 135
    invoke-direct {v0, v8}, Lrk5;-><init>(Ljava/util/ArrayList;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_3
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    const-wide/16 v9, 0x0

    .line 144
    .line 145
    move-object v14, v8

    .line 146
    move-object v15, v14

    .line 147
    move-object/from16 v16, v15

    .line 148
    .line 149
    move-wide v12, v9

    .line 150
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-ge v2, v0, :cond_a

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    int-to-char v4, v2

    .line 161
    if-eq v4, v6, :cond_9

    .line 162
    .line 163
    if-eq v4, v7, :cond_8

    .line 164
    .line 165
    if-eq v4, v5, :cond_7

    .line 166
    .line 167
    if-eq v4, v3, :cond_6

    .line 168
    .line 169
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_6
    invoke-static {v1, v2}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    move-object/from16 v16, v2

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    invoke-static {v1, v2}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    move-object v15, v2

    .line 185
    goto :goto_3

    .line 186
    :cond_8
    invoke-static {v1, v2}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    move-object v14, v2

    .line 191
    goto :goto_3

    .line 192
    :cond_9
    invoke-static {v1, v2}, Ll93;->X(Landroid/os/Parcel;I)J

    .line 193
    .line 194
    .line 195
    move-result-wide v8

    .line 196
    move-wide v12, v8

    .line 197
    goto :goto_3

    .line 198
    :cond_a
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 199
    .line 200
    .line 201
    new-instance v11, Lqk5;

    .line 202
    .line 203
    invoke-direct/range {v11 .. v16}, Lqk5;-><init>(J[B[B[B)V

    .line 204
    .line 205
    .line 206
    return-object v11

    .line 207
    :pswitch_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    :try_start_1
    invoke-static {v0}, Lbx;->a(I)Lbx;

    .line 212
    .line 213
    .line 214
    move-result-object v8
    :try_end_1
    .catch Lcom/google/android/gms/fido/fido2/api/common/COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException; {:try_start_1 .. :try_end_1} :catch_1

    .line 215
    goto :goto_4

    .line 216
    :catch_1
    move-exception v0

    .line 217
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_4
    return-object v8

    .line 221
    :pswitch_5
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    new-instance v2, Landroid/os/Bundle;

    .line 226
    .line 227
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 228
    .line 229
    .line 230
    sget-object v3, Lsh1;->B:[Lcom/google/android/gms/common/api/Scope;

    .line 231
    .line 232
    sget-object v5, Lsh1;->C:[Lp61;

    .line 233
    .line 234
    move-object/from16 v16, v2

    .line 235
    .line 236
    move-object v15, v3

    .line 237
    move v10, v4

    .line 238
    move v11, v10

    .line 239
    move v12, v11

    .line 240
    move/from16 v20, v12

    .line 241
    .line 242
    move/from16 v21, v20

    .line 243
    .line 244
    move/from16 v22, v21

    .line 245
    .line 246
    move-object/from16 v18, v5

    .line 247
    .line 248
    move-object/from16 v19, v18

    .line 249
    .line 250
    move-object v13, v8

    .line 251
    move-object v14, v13

    .line 252
    move-object/from16 v17, v14

    .line 253
    .line 254
    move-object/from16 v23, v17

    .line 255
    .line 256
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-ge v2, v0, :cond_c

    .line 261
    .line 262
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    int-to-char v3, v2

    .line 267
    packed-switch v3, :pswitch_data_1

    .line 268
    .line 269
    .line 270
    :pswitch_6
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :pswitch_7
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v23

    .line 278
    goto :goto_5

    .line 279
    :pswitch_8
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 280
    .line 281
    .line 282
    move-result v22

    .line 283
    goto :goto_5

    .line 284
    :pswitch_9
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 285
    .line 286
    .line 287
    move-result v21

    .line 288
    goto :goto_5

    .line 289
    :pswitch_a
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 290
    .line 291
    .line 292
    move-result v20

    .line 293
    goto :goto_5

    .line 294
    :pswitch_b
    sget-object v3, Lp61;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 295
    .line 296
    invoke-static {v1, v2, v3}, Ll93;->y(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    move-object/from16 v19, v2

    .line 301
    .line 302
    check-cast v19, [Lp61;

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :pswitch_c
    sget-object v3, Lp61;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 306
    .line 307
    invoke-static {v1, v2, v3}, Ll93;->y(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    move-object/from16 v18, v2

    .line 312
    .line 313
    check-cast v18, [Lp61;

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :pswitch_d
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 317
    .line 318
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    move-object/from16 v17, v2

    .line 323
    .line 324
    check-cast v17, Landroid/accounts/Account;

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :pswitch_e
    invoke-static {v1, v2}, Ll93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 328
    .line 329
    .line 330
    move-result-object v16

    .line 331
    goto :goto_5

    .line 332
    :pswitch_f
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 333
    .line 334
    invoke-static {v1, v2, v3}, Ll93;->y(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    move-object v15, v2

    .line 339
    check-cast v15, [Lcom/google/android/gms/common/api/Scope;

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :pswitch_10
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-nez v2, :cond_b

    .line 351
    .line 352
    move-object v14, v8

    .line 353
    goto :goto_5

    .line 354
    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    add-int/2addr v3, v2

    .line 359
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 360
    .line 361
    .line 362
    move-object v14, v4

    .line 363
    goto :goto_5

    .line 364
    :pswitch_11
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    goto :goto_5

    .line 369
    :pswitch_12
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    goto :goto_5

    .line 374
    :pswitch_13
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    goto :goto_5

    .line 379
    :pswitch_14
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    goto :goto_5

    .line 384
    :cond_c
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 385
    .line 386
    .line 387
    new-instance v9, Lsh1;

    .line 388
    .line 389
    invoke-direct/range {v9 .. v23}, Lsh1;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lp61;[Lp61;ZIZLjava/lang/String;)V

    .line 390
    .line 391
    .line 392
    return-object v9

    .line 393
    :pswitch_15
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    move-object v9, v8

    .line 398
    move-object v10, v9

    .line 399
    move-object v11, v10

    .line 400
    move-object v12, v11

    .line 401
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 402
    .line 403
    .line 404
    move-result v13

    .line 405
    if-ge v13, v0, :cond_13

    .line 406
    .line 407
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    int-to-char v14, v13

    .line 412
    if-eq v14, v7, :cond_12

    .line 413
    .line 414
    if-eq v14, v5, :cond_f

    .line 415
    .line 416
    if-eq v14, v3, :cond_e

    .line 417
    .line 418
    if-eq v14, v2, :cond_d

    .line 419
    .line 420
    invoke-static {v1, v13}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 421
    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_d
    invoke-static {v1, v13}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v12

    .line 428
    goto :goto_6

    .line 429
    :cond_e
    invoke-static {v1, v13}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    goto :goto_6

    .line 434
    :cond_f
    invoke-static {v1, v13}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-nez v10, :cond_10

    .line 439
    .line 440
    move-object v10, v8

    .line 441
    goto :goto_6

    .line 442
    :cond_10
    invoke-static {v1, v10, v3}, Ll93;->s0(Landroid/os/Parcel;II)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 446
    .line 447
    .line 448
    move-result v10

    .line 449
    if-eqz v10, :cond_11

    .line 450
    .line 451
    move v10, v6

    .line 452
    goto :goto_7

    .line 453
    :cond_11
    move v10, v4

    .line 454
    :goto_7
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    goto :goto_6

    .line 459
    :cond_12
    invoke-static {v1, v13}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    goto :goto_6

    .line 464
    :cond_13
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 465
    .line 466
    .line 467
    new-instance v0, Lnn;

    .line 468
    .line 469
    invoke-direct {v0, v9, v10, v11, v12}, Lnn;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_16
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    move v11, v4

    .line 478
    move v12, v11

    .line 479
    move v14, v12

    .line 480
    move-object v10, v8

    .line 481
    move-object v13, v10

    .line 482
    move-object v15, v13

    .line 483
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-ge v2, v0, :cond_16

    .line 488
    .line 489
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    int-to-char v3, v2

    .line 494
    packed-switch v3, :pswitch_data_2

    .line 495
    .line 496
    .line 497
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 498
    .line 499
    .line 500
    goto :goto_8

    .line 501
    :pswitch_17
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-nez v2, :cond_14

    .line 510
    .line 511
    move-object v15, v8

    .line 512
    goto :goto_8

    .line 513
    :cond_14
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    add-int/2addr v3, v2

    .line 518
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 519
    .line 520
    .line 521
    move-object v15, v4

    .line 522
    goto :goto_8

    .line 523
    :pswitch_18
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 524
    .line 525
    .line 526
    move-result v14

    .line 527
    goto :goto_8

    .line 528
    :pswitch_19
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-nez v2, :cond_15

    .line 537
    .line 538
    move-object v13, v8

    .line 539
    goto :goto_8

    .line 540
    :cond_15
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    add-int/2addr v3, v2

    .line 545
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 546
    .line 547
    .line 548
    move-object v13, v4

    .line 549
    goto :goto_8

    .line 550
    :pswitch_1a
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 551
    .line 552
    .line 553
    move-result v12

    .line 554
    goto :goto_8

    .line 555
    :pswitch_1b
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 556
    .line 557
    .line 558
    move-result v11

    .line 559
    goto :goto_8

    .line 560
    :pswitch_1c
    sget-object v3, Le34;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 561
    .line 562
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    move-object v10, v2

    .line 567
    check-cast v10, Le34;

    .line 568
    .line 569
    goto :goto_8

    .line 570
    :cond_16
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 571
    .line 572
    .line 573
    new-instance v9, Lpa0;

    .line 574
    .line 575
    invoke-direct/range {v9 .. v15}, Lpa0;-><init>(Le34;ZZ[II[I)V

    .line 576
    .line 577
    .line 578
    return-object v9

    .line 579
    :pswitch_1d
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    move v2, v4

    .line 584
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 585
    .line 586
    .line 587
    move-result v6

    .line 588
    if-ge v6, v0, :cond_1a

    .line 589
    .line 590
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 591
    .line 592
    .line 593
    move-result v6

    .line 594
    int-to-char v9, v6

    .line 595
    if-eq v9, v7, :cond_19

    .line 596
    .line 597
    if-eq v9, v5, :cond_18

    .line 598
    .line 599
    if-eq v9, v3, :cond_17

    .line 600
    .line 601
    invoke-static {v1, v6}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 602
    .line 603
    .line 604
    goto :goto_9

    .line 605
    :cond_17
    invoke-static {v1, v6}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    goto :goto_9

    .line 610
    :cond_18
    invoke-static {v1, v6}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v8

    .line 614
    goto :goto_9

    .line 615
    :cond_19
    invoke-static {v1, v6}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    goto :goto_9

    .line 620
    :cond_1a
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 621
    .line 622
    .line 623
    new-instance v0, Lln;

    .line 624
    .line 625
    invoke-direct {v0, v8, v4, v2}, Lln;-><init>(Ljava/lang/String;II)V

    .line 626
    .line 627
    .line 628
    return-object v0

    .line 629
    :pswitch_1e
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    move-object v2, v8

    .line 634
    move-object v9, v2

    .line 635
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 636
    .line 637
    .line 638
    move-result v10

    .line 639
    if-ge v10, v0, :cond_1f

    .line 640
    .line 641
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 642
    .line 643
    .line 644
    move-result v10

    .line 645
    int-to-char v11, v10

    .line 646
    if-eq v11, v6, :cond_1e

    .line 647
    .line 648
    if-eq v11, v7, :cond_1d

    .line 649
    .line 650
    if-eq v11, v5, :cond_1c

    .line 651
    .line 652
    if-eq v11, v3, :cond_1b

    .line 653
    .line 654
    invoke-static {v1, v10}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 655
    .line 656
    .line 657
    goto :goto_a

    .line 658
    :cond_1b
    sget-object v9, Lpa0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 659
    .line 660
    invoke-static {v1, v10, v9}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    check-cast v9, Lpa0;

    .line 665
    .line 666
    goto :goto_a

    .line 667
    :cond_1c
    invoke-static {v1, v10}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    goto :goto_a

    .line 672
    :cond_1d
    sget-object v2, Lp61;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 673
    .line 674
    invoke-static {v1, v10, v2}, Ll93;->y(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    check-cast v2, [Lp61;

    .line 679
    .line 680
    goto :goto_a

    .line 681
    :cond_1e
    invoke-static {v1, v10}, Ll93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 682
    .line 683
    .line 684
    move-result-object v8

    .line 685
    goto :goto_a

    .line 686
    :cond_1f
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 687
    .line 688
    .line 689
    new-instance v0, Ljk5;

    .line 690
    .line 691
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 692
    .line 693
    .line 694
    iput-object v8, v0, Ljk5;->n:Landroid/os/Bundle;

    .line 695
    .line 696
    iput-object v2, v0, Ljk5;->o:[Lp61;

    .line 697
    .line 698
    iput v4, v0, Ljk5;->p:I

    .line 699
    .line 700
    iput-object v9, v0, Ljk5;->q:Lpa0;

    .line 701
    .line 702
    return-object v0

    .line 703
    :pswitch_1f
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    move-object v4, v8

    .line 708
    move-object v6, v4

    .line 709
    move-object v9, v6

    .line 710
    move-object v10, v9

    .line 711
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 712
    .line 713
    .line 714
    move-result v11

    .line 715
    if-ge v11, v0, :cond_25

    .line 716
    .line 717
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 718
    .line 719
    .line 720
    move-result v11

    .line 721
    int-to-char v12, v11

    .line 722
    if-eq v12, v7, :cond_24

    .line 723
    .line 724
    if-eq v12, v5, :cond_23

    .line 725
    .line 726
    if-eq v12, v3, :cond_22

    .line 727
    .line 728
    if-eq v12, v2, :cond_20

    .line 729
    .line 730
    invoke-static {v1, v11}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 731
    .line 732
    .line 733
    goto :goto_b

    .line 734
    :cond_20
    invoke-static {v1, v11}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 735
    .line 736
    .line 737
    move-result v10

    .line 738
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 739
    .line 740
    .line 741
    move-result v11

    .line 742
    if-nez v10, :cond_21

    .line 743
    .line 744
    move-object v10, v8

    .line 745
    goto :goto_b

    .line 746
    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v12

    .line 750
    add-int/2addr v11, v10

    .line 751
    invoke-virtual {v1, v11}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 752
    .line 753
    .line 754
    move-object v10, v12

    .line 755
    goto :goto_b

    .line 756
    :cond_22
    invoke-static {v1, v11}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 757
    .line 758
    .line 759
    move-result-object v9

    .line 760
    goto :goto_b

    .line 761
    :cond_23
    invoke-static {v1, v11}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 762
    .line 763
    .line 764
    move-result-object v6

    .line 765
    goto :goto_b

    .line 766
    :cond_24
    invoke-static {v1, v11}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    goto :goto_b

    .line 771
    :cond_25
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 772
    .line 773
    .line 774
    new-instance v0, Lkn;

    .line 775
    .line 776
    invoke-direct {v0, v4, v6, v9, v10}, Lkn;-><init>([B[B[B[Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    return-object v0

    .line 780
    :pswitch_20
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    move-object v10, v8

    .line 785
    move-object v11, v10

    .line 786
    move-object v12, v11

    .line 787
    move-object v13, v12

    .line 788
    move-object v14, v13

    .line 789
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 790
    .line 791
    .line 792
    move-result v4

    .line 793
    if-ge v4, v0, :cond_2b

    .line 794
    .line 795
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    int-to-char v6, v4

    .line 800
    if-eq v6, v7, :cond_2a

    .line 801
    .line 802
    if-eq v6, v5, :cond_29

    .line 803
    .line 804
    if-eq v6, v3, :cond_28

    .line 805
    .line 806
    if-eq v6, v2, :cond_27

    .line 807
    .line 808
    const/4 v8, 0x6

    .line 809
    if-eq v6, v8, :cond_26

    .line 810
    .line 811
    invoke-static {v1, v4}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 812
    .line 813
    .line 814
    goto :goto_c

    .line 815
    :cond_26
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 816
    .line 817
    .line 818
    move-result-object v14

    .line 819
    goto :goto_c

    .line 820
    :cond_27
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 821
    .line 822
    .line 823
    move-result-object v13

    .line 824
    goto :goto_c

    .line 825
    :cond_28
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 826
    .line 827
    .line 828
    move-result-object v12

    .line 829
    goto :goto_c

    .line 830
    :cond_29
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 831
    .line 832
    .line 833
    move-result-object v11

    .line 834
    goto :goto_c

    .line 835
    :cond_2a
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 836
    .line 837
    .line 838
    move-result-object v10

    .line 839
    goto :goto_c

    .line 840
    :cond_2b
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 841
    .line 842
    .line 843
    new-instance v9, Ljn;

    .line 844
    .line 845
    invoke-direct/range {v9 .. v14}, Ljn;-><init>([B[B[B[B[B)V

    .line 846
    .line 847
    .line 848
    return-object v9

    .line 849
    :pswitch_21
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    move-object v2, v8

    .line 854
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    if-ge v3, v0, :cond_2e

    .line 859
    .line 860
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    int-to-char v5, v3

    .line 865
    if-eq v5, v6, :cond_2d

    .line 866
    .line 867
    if-eq v5, v7, :cond_2c

    .line 868
    .line 869
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 870
    .line 871
    .line 872
    goto :goto_d

    .line 873
    :cond_2c
    invoke-static {v1, v3}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    goto :goto_d

    .line 878
    :cond_2d
    invoke-static {v1, v3}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 879
    .line 880
    .line 881
    move-result v4

    .line 882
    goto :goto_d

    .line 883
    :cond_2e
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 884
    .line 885
    .line 886
    new-instance v0, Lsj5;

    .line 887
    .line 888
    if-nez v2, :cond_2f

    .line 889
    .line 890
    goto :goto_e

    .line 891
    :cond_2f
    array-length v1, v2

    .line 892
    invoke-static {v1, v2}, Lrj5;->i(I[B)Lrj5;

    .line 893
    .line 894
    .line 895
    move-result-object v8

    .line 896
    :goto_e
    invoke-direct {v0, v4, v8}, Lsj5;-><init>(ZLrj5;)V

    .line 897
    .line 898
    .line 899
    return-object v0

    .line 900
    :pswitch_22
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    move-object v2, v8

    .line 905
    move-object v3, v2

    .line 906
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 907
    .line 908
    .line 909
    move-result v4

    .line 910
    if-ge v4, v0, :cond_32

    .line 911
    .line 912
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    int-to-char v5, v4

    .line 917
    if-eq v5, v6, :cond_31

    .line 918
    .line 919
    if-eq v5, v7, :cond_30

    .line 920
    .line 921
    invoke-static {v1, v4}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 922
    .line 923
    .line 924
    goto :goto_f

    .line 925
    :cond_30
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    goto :goto_f

    .line 930
    :cond_31
    invoke-static {v1, v4}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    goto :goto_f

    .line 935
    :cond_32
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 936
    .line 937
    .line 938
    new-instance v0, Lzi5;

    .line 939
    .line 940
    if-nez v2, :cond_33

    .line 941
    .line 942
    move-object v1, v8

    .line 943
    goto :goto_10

    .line 944
    :cond_33
    array-length v1, v2

    .line 945
    invoke-static {v1, v2}, Lrj5;->i(I[B)Lrj5;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    :goto_10
    if-nez v3, :cond_34

    .line 950
    .line 951
    goto :goto_11

    .line 952
    :cond_34
    array-length v2, v3

    .line 953
    invoke-static {v2, v3}, Lrj5;->i(I[B)Lrj5;

    .line 954
    .line 955
    .line 956
    move-result-object v8

    .line 957
    :goto_11
    invoke-direct {v0, v1, v8}, Lzi5;-><init>(Lrj5;Lrj5;)V

    .line 958
    .line 959
    .line 960
    return-object v0

    .line 961
    :pswitch_23
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-ge v2, v0, :cond_36

    .line 970
    .line 971
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 972
    .line 973
    .line 974
    move-result v2

    .line 975
    int-to-char v3, v2

    .line 976
    if-eq v3, v6, :cond_35

    .line 977
    .line 978
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 979
    .line 980
    .line 981
    goto :goto_12

    .line 982
    :cond_35
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 983
    .line 984
    .line 985
    move-result v4

    .line 986
    goto :goto_12

    .line 987
    :cond_36
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 988
    .line 989
    .line 990
    new-instance v0, Lin;

    .line 991
    .line 992
    invoke-direct {v0, v4}, Lin;-><init>(Z)V

    .line 993
    .line 994
    .line 995
    return-object v0

    .line 996
    :pswitch_24
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    move-object v10, v8

    .line 1001
    move-object v11, v10

    .line 1002
    move-object v12, v11

    .line 1003
    move-object v13, v12

    .line 1004
    move-object v14, v13

    .line 1005
    move-object v15, v14

    .line 1006
    move-object/from16 v16, v15

    .line 1007
    .line 1008
    move-object/from16 v17, v16

    .line 1009
    .line 1010
    move-object/from16 v18, v17

    .line 1011
    .line 1012
    move-object/from16 v19, v18

    .line 1013
    .line 1014
    move-object/from16 v20, v19

    .line 1015
    .line 1016
    move-object/from16 v21, v20

    .line 1017
    .line 1018
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1019
    .line 1020
    .line 1021
    move-result v2

    .line 1022
    if-ge v2, v0, :cond_37

    .line 1023
    .line 1024
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1025
    .line 1026
    .line 1027
    move-result v2

    .line 1028
    int-to-char v3, v2

    .line 1029
    packed-switch v3, :pswitch_data_3

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_13

    .line 1036
    :pswitch_25
    sget-object v3, Llh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1037
    .line 1038
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    move-object/from16 v21, v2

    .line 1043
    .line 1044
    check-cast v21, Llh5;

    .line 1045
    .line 1046
    goto :goto_13

    .line 1047
    :pswitch_26
    sget-object v3, Lnh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1048
    .line 1049
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    move-object/from16 v20, v2

    .line 1054
    .line 1055
    check-cast v20, Lnh5;

    .line 1056
    .line 1057
    goto :goto_13

    .line 1058
    :pswitch_27
    sget-object v3, Lmh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1059
    .line 1060
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    move-object/from16 v19, v2

    .line 1065
    .line 1066
    check-cast v19, Lmh5;

    .line 1067
    .line 1068
    goto :goto_13

    .line 1069
    :pswitch_28
    sget-object v3, Lpj1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1070
    .line 1071
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    move-object/from16 v18, v2

    .line 1076
    .line 1077
    check-cast v18, Lpj1;

    .line 1078
    .line 1079
    goto :goto_13

    .line 1080
    :pswitch_29
    sget-object v3, Lkh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1081
    .line 1082
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v2

    .line 1086
    move-object/from16 v17, v2

    .line 1087
    .line 1088
    check-cast v17, Lkh5;

    .line 1089
    .line 1090
    goto :goto_13

    .line 1091
    :pswitch_2a
    sget-object v3, Luk5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1092
    .line 1093
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v2

    .line 1097
    move-object/from16 v16, v2

    .line 1098
    .line 1099
    check-cast v16, Luk5;

    .line 1100
    .line 1101
    goto :goto_13

    .line 1102
    :pswitch_2b
    sget-object v3, Lhh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1103
    .line 1104
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    move-object v15, v2

    .line 1109
    check-cast v15, Lhh5;

    .line 1110
    .line 1111
    goto :goto_13

    .line 1112
    :pswitch_2c
    sget-object v3, Lgh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1113
    .line 1114
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    move-object v14, v2

    .line 1119
    check-cast v14, Lgh5;

    .line 1120
    .line 1121
    goto :goto_13

    .line 1122
    :pswitch_2d
    sget-object v3, Lwk5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1123
    .line 1124
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    move-object v13, v2

    .line 1129
    check-cast v13, Lwk5;

    .line 1130
    .line 1131
    goto :goto_13

    .line 1132
    :pswitch_2e
    sget-object v3, Ly25;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1133
    .line 1134
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    move-object v12, v2

    .line 1139
    check-cast v12, Ly25;

    .line 1140
    .line 1141
    goto :goto_13

    .line 1142
    :pswitch_2f
    sget-object v3, Lrk5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1143
    .line 1144
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    move-object v11, v2

    .line 1149
    check-cast v11, Lrk5;

    .line 1150
    .line 1151
    goto/16 :goto_13

    .line 1152
    .line 1153
    :pswitch_30
    sget-object v3, Ls61;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1154
    .line 1155
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    move-object v10, v2

    .line 1160
    check-cast v10, Ls61;

    .line 1161
    .line 1162
    goto/16 :goto_13

    .line 1163
    .line 1164
    :cond_37
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1165
    .line 1166
    .line 1167
    new-instance v9, Lgn;

    .line 1168
    .line 1169
    invoke-direct/range {v9 .. v21}, Lgn;-><init>(Ls61;Lrk5;Ly25;Lwk5;Lgh5;Lhh5;Luk5;Lkh5;Lpj1;Lmh5;Lnh5;Llh5;)V

    .line 1170
    .line 1171
    .line 1172
    return-object v9

    .line 1173
    :pswitch_31
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1174
    .line 1175
    .line 1176
    move-result v0

    .line 1177
    const-wide/16 v2, -0x1

    .line 1178
    .line 1179
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1180
    .line 1181
    .line 1182
    move-result v9

    .line 1183
    if-ge v9, v0, :cond_3b

    .line 1184
    .line 1185
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1186
    .line 1187
    .line 1188
    move-result v9

    .line 1189
    int-to-char v10, v9

    .line 1190
    if-eq v10, v6, :cond_3a

    .line 1191
    .line 1192
    if-eq v10, v7, :cond_39

    .line 1193
    .line 1194
    if-eq v10, v5, :cond_38

    .line 1195
    .line 1196
    invoke-static {v1, v9}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1197
    .line 1198
    .line 1199
    goto :goto_14

    .line 1200
    :cond_38
    invoke-static {v1, v9}, Ll93;->X(Landroid/os/Parcel;I)J

    .line 1201
    .line 1202
    .line 1203
    move-result-wide v2

    .line 1204
    goto :goto_14

    .line 1205
    :cond_39
    invoke-static {v1, v9}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1206
    .line 1207
    .line 1208
    move-result v4

    .line 1209
    goto :goto_14

    .line 1210
    :cond_3a
    invoke-static {v1, v9}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v8

    .line 1214
    goto :goto_14

    .line 1215
    :cond_3b
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1216
    .line 1217
    .line 1218
    new-instance v0, Lp61;

    .line 1219
    .line 1220
    invoke-direct {v0, v4, v2, v3, v8}, Lp61;-><init>(IJLjava/lang/String;)V

    .line 1221
    .line 1222
    .line 1223
    return-object v0

    .line 1224
    :pswitch_32
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1225
    .line 1226
    .line 1227
    move-result v0

    .line 1228
    move-object v10, v8

    .line 1229
    move-object v11, v10

    .line 1230
    move-object v12, v11

    .line 1231
    move-object v13, v12

    .line 1232
    move-object v14, v13

    .line 1233
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1234
    .line 1235
    .line 1236
    move-result v4

    .line 1237
    if-ge v4, v0, :cond_41

    .line 1238
    .line 1239
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1240
    .line 1241
    .line 1242
    move-result v4

    .line 1243
    int-to-char v8, v4

    .line 1244
    if-eq v8, v6, :cond_40

    .line 1245
    .line 1246
    if-eq v8, v7, :cond_3f

    .line 1247
    .line 1248
    if-eq v8, v5, :cond_3e

    .line 1249
    .line 1250
    if-eq v8, v3, :cond_3d

    .line 1251
    .line 1252
    if-eq v8, v2, :cond_3c

    .line 1253
    .line 1254
    invoke-static {v1, v4}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_15

    .line 1258
    :cond_3c
    invoke-static {v1, v4}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v14

    .line 1262
    goto :goto_15

    .line 1263
    :cond_3d
    sget-object v8, Lsj5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1264
    .line 1265
    invoke-static {v1, v4, v8}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v4

    .line 1269
    move-object v13, v4

    .line 1270
    check-cast v13, Lsj5;

    .line 1271
    .line 1272
    goto :goto_15

    .line 1273
    :cond_3e
    sget-object v8, Lin;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1274
    .line 1275
    invoke-static {v1, v4, v8}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v4

    .line 1279
    move-object v12, v4

    .line 1280
    check-cast v12, Lin;

    .line 1281
    .line 1282
    goto :goto_15

    .line 1283
    :cond_3f
    sget-object v8, Lzi5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1284
    .line 1285
    invoke-static {v1, v4, v8}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v4

    .line 1289
    move-object v11, v4

    .line 1290
    check-cast v11, Lzi5;

    .line 1291
    .line 1292
    goto :goto_15

    .line 1293
    :cond_40
    sget-object v8, Lg35;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1294
    .line 1295
    invoke-static {v1, v4, v8}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    move-object v10, v4

    .line 1300
    check-cast v10, Lg35;

    .line 1301
    .line 1302
    goto :goto_15

    .line 1303
    :cond_41
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1304
    .line 1305
    .line 1306
    new-instance v9, Lhn;

    .line 1307
    .line 1308
    invoke-direct/range {v9 .. v14}, Lhn;-><init>(Lg35;Lzi5;Lin;Lsj5;Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    return-object v9

    .line 1312
    :pswitch_33
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1313
    .line 1314
    .line 1315
    move-result v0

    .line 1316
    move v2, v4

    .line 1317
    move v8, v2

    .line 1318
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1319
    .line 1320
    .line 1321
    move-result v9

    .line 1322
    if-ge v9, v0, :cond_45

    .line 1323
    .line 1324
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1325
    .line 1326
    .line 1327
    move-result v9

    .line 1328
    int-to-char v10, v9

    .line 1329
    if-eq v10, v6, :cond_44

    .line 1330
    .line 1331
    if-eq v10, v7, :cond_43

    .line 1332
    .line 1333
    if-eq v10, v5, :cond_42

    .line 1334
    .line 1335
    invoke-static {v1, v9}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_16

    .line 1339
    :cond_42
    invoke-static {v1, v9, v3}, Ll93;->t0(Landroid/os/Parcel;II)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1343
    .line 1344
    .line 1345
    move-result v8

    .line 1346
    int-to-short v8, v8

    .line 1347
    goto :goto_16

    .line 1348
    :cond_43
    invoke-static {v1, v9, v3}, Ll93;->t0(Landroid/os/Parcel;II)V

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1352
    .line 1353
    .line 1354
    move-result v2

    .line 1355
    int-to-short v2, v2

    .line 1356
    goto :goto_16

    .line 1357
    :cond_44
    invoke-static {v1, v9}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    goto :goto_16

    .line 1362
    :cond_45
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1363
    .line 1364
    .line 1365
    new-instance v0, Lh35;

    .line 1366
    .line 1367
    invoke-direct {v0, v4, v2, v8}, Lh35;-><init>(ISS)V

    .line 1368
    .line 1369
    .line 1370
    return-object v0

    .line 1371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_16
        :pswitch_15
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_6
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lrh5;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Ls61;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lc21;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Luk5;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lrk5;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lqk5;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lbx;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lsh1;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lnn;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lpa0;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lln;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Ljk5;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lkn;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Ljn;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lsj5;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lzi5;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lin;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lgn;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lp61;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lhn;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lh35;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
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
