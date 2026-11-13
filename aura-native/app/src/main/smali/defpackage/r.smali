.class public final Ldefpackage/r;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public final synthetic o:I

.field public p:I

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/aw;Ldefpackage/vd0;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Ldefpackage/r;->o:I

    .line 15
    iput-object p1, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V
    .locals 0

    .line 1
    iput p5, p0, Ldefpackage/r;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V
    .locals 0

    .line 14
    iput p4, p0, Ldefpackage/r;->o:I

    iput-object p1, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/r;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, Ldefpackage/r;

    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, Ldefpackage/td5;

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, p0

    .line 18
    check-cast v4, Ldefpackage/oc2;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Ldefpackage/qc5;

    .line 22
    .line 23
    const/16 v7, 0xf

    .line 24
    .line 25
    move-object v6, p2

    .line 26
    invoke-direct/range {v2 .. v7}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    move-object v7, p2

    .line 31
    new-instance v3, Ldefpackage/r;

    .line 32
    .line 33
    iget-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v4, p1

    .line 36
    check-cast v4, Ldefpackage/c52;

    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v5, p0

    .line 41
    check-cast v5, Ldefpackage/dd5;

    .line 42
    .line 43
    move-object v6, v1

    .line 44
    check-cast v6, Ldefpackage/c93;

    .line 45
    .line 46
    const/16 v8, 0xe

    .line 47
    .line 48
    invoke-direct/range {v3 .. v8}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :pswitch_1
    move-object v7, p2

    .line 53
    new-instance p2, Ldefpackage/r;

    .line 54
    .line 55
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Ldefpackage/g74;

    .line 58
    .line 59
    check-cast v1, Ldefpackage/wf1;

    .line 60
    .line 61
    const/16 v0, 0xd

    .line 62
    .line 63
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 67
    .line 68
    return-object p2

    .line 69
    :pswitch_2
    move-object v7, p2

    .line 70
    new-instance p2, Ldefpackage/r;

    .line 71
    .line 72
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ldefpackage/hv0;

    .line 75
    .line 76
    check-cast v1, Ldefpackage/g74;

    .line 77
    .line 78
    const/16 v0, 0xc

    .line 79
    .line 80
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 84
    .line 85
    return-object p2

    .line 86
    :pswitch_3
    move-object v7, p2

    .line 87
    new-instance p2, Ldefpackage/r;

    .line 88
    .line 89
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Ldefpackage/x60;

    .line 92
    .line 93
    check-cast v1, Ldefpackage/wf1;

    .line 94
    .line 95
    const/16 v0, 0xb

    .line 96
    .line 97
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 101
    .line 102
    return-object p2

    .line 103
    :pswitch_4
    move-object v7, p2

    .line 104
    new-instance p2, Ldefpackage/r;

    .line 105
    .line 106
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Ldefpackage/sv3;

    .line 109
    .line 110
    check-cast v1, Ldefpackage/ed;

    .line 111
    .line 112
    const/16 v0, 0xa

    .line 113
    .line 114
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 118
    .line 119
    return-object p2

    .line 120
    :pswitch_5
    move-object v7, p2

    .line 121
    new-instance p2, Ldefpackage/r;

    .line 122
    .line 123
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Ldefpackage/mc0;

    .line 126
    .line 127
    check-cast v1, Ldefpackage/p53;

    .line 128
    .line 129
    const/16 v0, 0x9

    .line 130
    .line 131
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 132
    .line 133
    .line 134
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 135
    .line 136
    return-object p2

    .line 137
    :pswitch_6
    move-object v7, p2

    .line 138
    new-instance p2, Ldefpackage/r;

    .line 139
    .line 140
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Ldefpackage/wf1;

    .line 143
    .line 144
    check-cast v1, Ldefpackage/oy;

    .line 145
    .line 146
    const/16 v0, 0x8

    .line 147
    .line 148
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 149
    .line 150
    .line 151
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 152
    .line 153
    return-object p2

    .line 154
    :pswitch_7
    move-object v7, p2

    .line 155
    new-instance p0, Ldefpackage/r;

    .line 156
    .line 157
    check-cast v1, Ldefpackage/aw;

    .line 158
    .line 159
    invoke-direct {p0, v1, v7}, Ldefpackage/r;-><init>(Ldefpackage/aw;Ldefpackage/vd0;)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_8
    move-object v7, p2

    .line 164
    new-instance v3, Ldefpackage/r;

    .line 165
    .line 166
    iget-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 167
    .line 168
    move-object v4, p1

    .line 169
    check-cast v4, Ldefpackage/rm2;

    .line 170
    .line 171
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 172
    .line 173
    move-object v5, p0

    .line 174
    check-cast v5, Ldefpackage/q02;

    .line 175
    .line 176
    move-object v6, v1

    .line 177
    check-cast v6, Ldefpackage/as0;

    .line 178
    .line 179
    const/4 v8, 0x6

    .line 180
    invoke-direct/range {v3 .. v8}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 181
    .line 182
    .line 183
    return-object v3

    .line 184
    :pswitch_9
    move-object v7, p2

    .line 185
    new-instance v3, Ldefpackage/r;

    .line 186
    .line 187
    iget-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v4, p1

    .line 190
    check-cast v4, Ldefpackage/ml3;

    .line 191
    .line 192
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v5, p0

    .line 195
    check-cast v5, Ldefpackage/h13;

    .line 196
    .line 197
    move-object v6, v1

    .line 198
    check-cast v6, Ldefpackage/wf1;

    .line 199
    .line 200
    const/4 v8, 0x5

    .line 201
    invoke-direct/range {v3 .. v8}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 202
    .line 203
    .line 204
    return-object v3

    .line 205
    :pswitch_a
    move-object v7, p2

    .line 206
    new-instance p2, Ldefpackage/r;

    .line 207
    .line 208
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p0, Ldefpackage/ml3;

    .line 211
    .line 212
    check-cast v1, Ldefpackage/wf1;

    .line 213
    .line 214
    const/4 v0, 0x4

    .line 215
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 216
    .line 217
    .line 218
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 219
    .line 220
    return-object p2

    .line 221
    :pswitch_b
    move-object v7, p2

    .line 222
    new-instance p1, Ldefpackage/r;

    .line 223
    .line 224
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p0, Ldefpackage/jx3;

    .line 227
    .line 228
    check-cast v1, Ldefpackage/wn3;

    .line 229
    .line 230
    const/4 p2, 0x3

    .line 231
    invoke-direct {p1, p0, v1, v7, p2}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 232
    .line 233
    .line 234
    return-object p1

    .line 235
    :pswitch_c
    move-object v7, p2

    .line 236
    new-instance p2, Ldefpackage/r;

    .line 237
    .line 238
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, Ldefpackage/q81;

    .line 241
    .line 242
    check-cast v1, Ldefpackage/z00;

    .line 243
    .line 244
    const/4 v0, 0x2

    .line 245
    invoke-direct {p2, p0, v1, v7, v0}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 246
    .line 247
    .line 248
    iput-object p1, p2, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 249
    .line 250
    return-object p2

    .line 251
    :pswitch_d
    move-object v7, p2

    .line 252
    new-instance v3, Ldefpackage/r;

    .line 253
    .line 254
    iget-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v4, p1

    .line 257
    check-cast v4, Ldefpackage/cv;

    .line 258
    .line 259
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 260
    .line 261
    move-object v5, p0

    .line 262
    check-cast v5, Ldefpackage/f63;

    .line 263
    .line 264
    move-object v6, v1

    .line 265
    check-cast v6, Ldefpackage/fa;

    .line 266
    .line 267
    const/4 v8, 0x1

    .line 268
    invoke-direct/range {v3 .. v8}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 269
    .line 270
    .line 271
    return-object v3

    .line 272
    :pswitch_e
    move-object v7, p2

    .line 273
    new-instance v3, Ldefpackage/r;

    .line 274
    .line 275
    iget-object p1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 276
    .line 277
    move-object v4, p1

    .line 278
    check-cast v4, Ldefpackage/rm2;

    .line 279
    .line 280
    iget-object p0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 281
    .line 282
    move-object v5, p0

    .line 283
    check-cast v5, Ldefpackage/aq3;

    .line 284
    .line 285
    move-object v6, v1

    .line 286
    check-cast v6, Ldefpackage/as0;

    .line 287
    .line 288
    const/4 v8, 0x0

    .line 289
    invoke-direct/range {v3 .. v8}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 290
    .line 291
    .line 292
    return-object v3

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/r;->o:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ldefpackage/we0;

    .line 9
    .line 10
    check-cast p2, Ldefpackage/vd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/r;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ldefpackage/we0;

    .line 24
    .line 25
    check-cast p2, Ldefpackage/vd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ldefpackage/r;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Ldefpackage/q64;

    .line 39
    .line 40
    check-cast p2, Ldefpackage/vd0;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ldefpackage/r;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_2
    check-cast p1, Ldefpackage/e74;

    .line 54
    .line 55
    check-cast p2, Ldefpackage/vd0;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ldefpackage/r;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_3
    check-cast p1, Ldefpackage/we0;

    .line 69
    .line 70
    check-cast p2, Ldefpackage/vd0;

    .line 71
    .line 72
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ldefpackage/r;

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_4
    check-cast p1, Ldefpackage/we0;

    .line 84
    .line 85
    check-cast p2, Ldefpackage/vd0;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Ldefpackage/r;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_5
    check-cast p1, Ldefpackage/rq3;

    .line 99
    .line 100
    check-cast p2, Ldefpackage/vd0;

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Ldefpackage/r;

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_6
    check-cast p1, Ldefpackage/we0;

    .line 114
    .line 115
    check-cast p2, Ldefpackage/vd0;

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ldefpackage/r;

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_7
    check-cast p1, Ldefpackage/we0;

    .line 129
    .line 130
    check-cast p2, Ldefpackage/vd0;

    .line 131
    .line 132
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Ldefpackage/r;

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_8
    check-cast p1, Ldefpackage/we0;

    .line 144
    .line 145
    check-cast p2, Ldefpackage/vd0;

    .line 146
    .line 147
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, Ldefpackage/r;

    .line 152
    .line 153
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_9
    check-cast p1, Ldefpackage/we0;

    .line 159
    .line 160
    check-cast p2, Ldefpackage/vd0;

    .line 161
    .line 162
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Ldefpackage/r;

    .line 167
    .line 168
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :pswitch_a
    check-cast p1, Ldefpackage/q64;

    .line 174
    .line 175
    check-cast p2, Ldefpackage/vd0;

    .line 176
    .line 177
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Ldefpackage/r;

    .line 182
    .line 183
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_b
    check-cast p1, Ldefpackage/we0;

    .line 189
    .line 190
    check-cast p2, Ldefpackage/vd0;

    .line 191
    .line 192
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Ldefpackage/r;

    .line 197
    .line 198
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_c
    check-cast p1, Ldefpackage/we0;

    .line 204
    .line 205
    check-cast p2, Ldefpackage/vd0;

    .line 206
    .line 207
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    check-cast p0, Ldefpackage/r;

    .line 212
    .line 213
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_d
    check-cast p1, Ldefpackage/we0;

    .line 219
    .line 220
    check-cast p2, Ldefpackage/vd0;

    .line 221
    .line 222
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    check-cast p0, Ldefpackage/r;

    .line 227
    .line 228
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_e
    check-cast p1, Ldefpackage/we0;

    .line 234
    .line 235
    check-cast p2, Ldefpackage/vd0;

    .line 236
    .line 237
    invoke-virtual {p0, p1, p2}, Ldefpackage/r;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, Ldefpackage/r;

    .line 242
    .line 243
    invoke-virtual {p0, v1}, Ldefpackage/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ldefpackage/r;->o:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v8, v0

    .line 15
    check-cast v8, Ldefpackage/oc2;

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ldefpackage/td5;

    .line 20
    .line 21
    iget-object v9, v0, Ldefpackage/td5;->a:Ldefpackage/dd5;

    .line 22
    .line 23
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 24
    .line 25
    iget v3, p0, Ldefpackage/r;->p:I

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    if-eq v3, v5, :cond_1

    .line 30
    .line 31
    if-ne v3, v1, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object p0, p1

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object p0, v6

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v11, v0, Ldefpackage/td5;->b:Landroid/content/Context;

    .line 54
    .line 55
    iget-object v3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v10, v3

    .line 58
    check-cast v10, Ldefpackage/qc5;

    .line 59
    .line 60
    iget-object v0, v0, Ldefpackage/td5;->d:Ldefpackage/bq4;

    .line 61
    .line 62
    iput v5, p0, Ldefpackage/r;->p:I

    .line 63
    .line 64
    sget-object v3, Ldefpackage/pc5;->a:Ljava/lang/String;

    .line 65
    .line 66
    sget-object v3, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 67
    .line 68
    iget-boolean v4, v9, Ldefpackage/dd5;->q:Z

    .line 69
    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    .line 74
    const/16 v5, 0x1f

    .line 75
    .line 76
    if-lt v4, v5, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-object v0, v0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ldefpackage/vc5;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Ldefpackage/kb4;->w(Ljava/util/concurrent/Executor;)Ldefpackage/pe0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v7, Ldefpackage/x70;

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    const/16 v13, 0x9

    .line 94
    .line 95
    invoke-direct/range {v7 .. v13}, Ldefpackage/x70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v7, p0}, Ldefpackage/fu;->P(Ldefpackage/ne0;Ldefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-ne v0, v2, :cond_4

    .line 103
    .line 104
    move-object v3, v0

    .line 105
    :cond_4
    :goto_0
    if-ne v3, v2, :cond_5

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    :goto_1
    sget-object v0, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v5, "Starting work for "

    .line 117
    .line 118
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v5, v9, Ldefpackage/dd5;->c:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v3, v0, v4}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8}, Ldefpackage/oc2;->c()Ldefpackage/ry;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput v1, p0, Ldefpackage/r;->p:I

    .line 138
    .line 139
    invoke-static {v0, v8, p0}, Ldefpackage/ud5;->a(Ldefpackage/ic2;Ldefpackage/oc2;Ldefpackage/ep4;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-ne p0, v2, :cond_6

    .line 144
    .line 145
    :goto_2
    move-object p0, v2

    .line 146
    :cond_6
    :goto_3
    return-object p0

    .line 147
    :pswitch_0
    iget-object v0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Ldefpackage/dd5;

    .line 150
    .line 151
    sget-object v1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 152
    .line 153
    iget v2, p0, Ldefpackage/r;->p:I

    .line 154
    .line 155
    if-eqz v2, :cond_8

    .line 156
    .line 157
    if-ne v2, v5, :cond_7

    .line 158
    .line 159
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_7
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 164
    .line 165
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v2, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Ldefpackage/c52;

    .line 175
    .line 176
    invoke-virtual {v2, v0}, Ldefpackage/c52;->f(Ldefpackage/dd5;)Ldefpackage/p81;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    new-instance v4, Ldefpackage/lv0;

    .line 181
    .line 182
    iget-object v6, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v6, Ldefpackage/c93;

    .line 185
    .line 186
    invoke-direct {v4, v3, v6, v0}, Ldefpackage/lv0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iput v5, p0, Ldefpackage/r;->p:I

    .line 190
    .line 191
    invoke-interface {v2, v4, p0}, Ldefpackage/p81;->a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, v1, :cond_9

    .line 196
    .line 197
    move-object v6, v1

    .line 198
    goto :goto_5

    .line 199
    :cond_9
    :goto_4
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 200
    .line 201
    :goto_5
    return-object v6

    .line 202
    :pswitch_1
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 203
    .line 204
    iget v1, p0, Ldefpackage/r;->p:I

    .line 205
    .line 206
    if-eqz v1, :cond_b

    .line 207
    .line 208
    if-ne v1, v5, :cond_a

    .line 209
    .line 210
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_a
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 215
    .line 216
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_b
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, Ldefpackage/q64;

    .line 226
    .line 227
    iget-object v2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v2, Ldefpackage/g74;

    .line 230
    .line 231
    iput-object v1, v2, Ldefpackage/g74;->k:Ldefpackage/q64;

    .line 232
    .line 233
    iget-object v1, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v1, Ldefpackage/wf1;

    .line 236
    .line 237
    iget-object v2, v2, Ldefpackage/g74;->l:Ldefpackage/e74;

    .line 238
    .line 239
    iput v5, p0, Ldefpackage/r;->p:I

    .line 240
    .line 241
    invoke-interface {v1, v2, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    if-ne p0, v0, :cond_c

    .line 246
    .line 247
    move-object v6, v0

    .line 248
    goto :goto_7

    .line 249
    :cond_c
    :goto_6
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 250
    .line 251
    :goto_7
    return-object v6

    .line 252
    :pswitch_2
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 253
    .line 254
    iget v1, p0, Ldefpackage/r;->p:I

    .line 255
    .line 256
    if-eqz v1, :cond_e

    .line 257
    .line 258
    if-ne v1, v5, :cond_d

    .line 259
    .line 260
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_d
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 265
    .line 266
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_e
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v1, Ldefpackage/e74;

    .line 276
    .line 277
    iget-object v2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v2, Ldefpackage/hv0;

    .line 280
    .line 281
    iget-object v3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v3, Ldefpackage/g74;

    .line 284
    .line 285
    new-instance v4, Ldefpackage/o;

    .line 286
    .line 287
    const/16 v6, 0x1b

    .line 288
    .line 289
    invoke-direct {v4, v6, v1, v3}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iput v5, p0, Ldefpackage/r;->p:I

    .line 293
    .line 294
    invoke-virtual {v2, v4, p0}, Ldefpackage/hv0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    if-ne p0, v0, :cond_f

    .line 299
    .line 300
    move-object v6, v0

    .line 301
    goto :goto_9

    .line 302
    :cond_f
    :goto_8
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 303
    .line 304
    :goto_9
    return-object v6

    .line 305
    :pswitch_3
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 306
    .line 307
    iget v1, p0, Ldefpackage/r;->p:I

    .line 308
    .line 309
    if-eqz v1, :cond_11

    .line 310
    .line 311
    if-ne v1, v5, :cond_10

    .line 312
    .line 313
    iget-object p0, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p0, Ldefpackage/x60;

    .line 316
    .line 317
    :try_start_0
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    .line 319
    .line 320
    move-object v0, p1

    .line 321
    goto :goto_b

    .line 322
    :catchall_0
    move-exception v0

    .line 323
    goto :goto_a

    .line 324
    :cond_10
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 325
    .line 326
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_d

    .line 330
    :cond_11
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v1, Ldefpackage/we0;

    .line 336
    .line 337
    iget-object v2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v2, Ldefpackage/x60;

    .line 340
    .line 341
    iget-object v3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v3, Ldefpackage/wf1;

    .line 344
    .line 345
    :try_start_1
    iput-object v2, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 346
    .line 347
    iput v5, p0, Ldefpackage/r;->p:I

    .line 348
    .line 349
    invoke-interface {v3, v1, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 353
    if-ne p0, v0, :cond_12

    .line 354
    .line 355
    move-object v6, v0

    .line 356
    goto :goto_d

    .line 357
    :cond_12
    move-object v0, p0

    .line 358
    move-object p0, v2

    .line 359
    goto :goto_b

    .line 360
    :catchall_1
    move-exception v0

    .line 361
    move-object p0, v2

    .line 362
    :goto_a
    new-instance v1, Ldefpackage/s14;

    .line 363
    .line 364
    invoke-direct {v1, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 365
    .line 366
    .line 367
    move-object v0, v1

    .line 368
    :goto_b
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    if-nez v1, :cond_13

    .line 373
    .line 374
    invoke-virtual {p0, v0}, Ldefpackage/a32;->Q(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v0, Ldefpackage/a70;

    .line 382
    .line 383
    invoke-direct {v0, v1, v4}, Ldefpackage/a70;-><init>(Ljava/lang/Throwable;Z)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p0, v0}, Ldefpackage/a32;->Q(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    :goto_c
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 390
    .line 391
    :goto_d
    return-object v6

    .line 392
    :pswitch_4
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 393
    .line 394
    iget v1, p0, Ldefpackage/r;->p:I

    .line 395
    .line 396
    if-eqz v1, :cond_15

    .line 397
    .line 398
    if-ne v1, v5, :cond_14

    .line 399
    .line 400
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :cond_14
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 407
    .line 408
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    goto :goto_e

    .line 412
    :cond_15
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v1, Ldefpackage/we0;

    .line 418
    .line 419
    iget-object v2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v2, Ldefpackage/sv3;

    .line 422
    .line 423
    iget-object v3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v3, Ldefpackage/ed;

    .line 426
    .line 427
    iput v5, p0, Ldefpackage/r;->p:I

    .line 428
    .line 429
    invoke-virtual {v2, v1, v3, p0}, Ldefpackage/sv3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-object v6, v0

    .line 433
    :goto_e
    return-object v6

    .line 434
    :pswitch_5
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 435
    .line 436
    iget v0, p0, Ldefpackage/r;->p:I

    .line 437
    .line 438
    if-eqz v0, :cond_17

    .line 439
    .line 440
    if-ne v0, v5, :cond_16

    .line 441
    .line 442
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_13

    .line 446
    .line 447
    :cond_16
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 448
    .line 449
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_14

    .line 453
    .line 454
    :cond_17
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    iget-object v0, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 458
    .line 459
    move-object v7, v0

    .line 460
    check-cast v7, Ldefpackage/rq3;

    .line 461
    .line 462
    iget-object v0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Ldefpackage/mc0;

    .line 465
    .line 466
    invoke-virtual {v0}, Ldefpackage/mc0;->a()Landroid/net/NetworkRequest;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-nez v0, :cond_18

    .line 471
    .line 472
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object p0, v7, Ldefpackage/rq3;->s:Ldefpackage/aw;

    .line 476
    .line 477
    invoke-virtual {p0, v6, v4}, Ldefpackage/aw;->l(Ljava/lang/Throwable;Z)Z

    .line 478
    .line 479
    .line 480
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 481
    .line 482
    goto/16 :goto_14

    .line 483
    .line 484
    :cond_18
    new-instance v8, Ldefpackage/p;

    .line 485
    .line 486
    iget-object v9, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v9, Ldefpackage/p53;

    .line 489
    .line 490
    const/16 v10, 0xd

    .line 491
    .line 492
    invoke-direct {v8, v9, v7, v6, v10}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 493
    .line 494
    .line 495
    invoke-static {v7, v6, v6, v8, v3}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    new-instance v8, Ldefpackage/br0;

    .line 500
    .line 501
    invoke-direct {v8, v3, v6, v7}, Ldefpackage/br0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 505
    .line 506
    const/16 v6, 0x1e

    .line 507
    .line 508
    if-lt v3, v6, :cond_1a

    .line 509
    .line 510
    sget-object v3, Ldefpackage/ed4;->a:Ldefpackage/ed4;

    .line 511
    .line 512
    iget-object v4, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v4, Ldefpackage/p53;

    .line 515
    .line 516
    iget-object v4, v4, Ldefpackage/p53;->a:Landroid/net/ConnectivityManager;

    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    sget-object v6, Ldefpackage/ed4;->b:Ljava/lang/Object;

    .line 522
    .line 523
    monitor-enter v6

    .line 524
    :try_start_2
    sget-object v9, Ldefpackage/ed4;->c:Ljava/util/LinkedHashMap;

    .line 525
    .line 526
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    .line 527
    .line 528
    .line 529
    move-result v10

    .line 530
    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    if-eqz v10, :cond_19

    .line 534
    .line 535
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    sget-object v9, Ldefpackage/lc5;->a:Ljava/lang/String;

    .line 540
    .line 541
    const-string v10, "NetworkRequestConstraintController register shared callback"

    .line 542
    .line 543
    invoke-virtual {v8, v9, v10}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v4, v3}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 547
    .line 548
    .line 549
    goto :goto_f

    .line 550
    :catchall_2
    move-exception v0

    .line 551
    move-object p0, v0

    .line 552
    goto :goto_10

    .line 553
    :cond_19
    :goto_f
    monitor-exit v6

    .line 554
    new-instance v6, Ldefpackage/w90;

    .line 555
    .line 556
    invoke-direct {v6, v0, v4, v3, v1}, Ldefpackage/w90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 557
    .line 558
    .line 559
    goto :goto_12

    .line 560
    :goto_10
    monitor-exit v6

    .line 561
    throw p0

    .line 562
    :cond_1a
    sget v1, Ldefpackage/oy1;->c:I

    .line 563
    .line 564
    iget-object v1, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v1, Ldefpackage/p53;

    .line 567
    .line 568
    iget-object v1, v1, Ldefpackage/p53;->a:Landroid/net/ConnectivityManager;

    .line 569
    .line 570
    new-instance v3, Ldefpackage/oy1;

    .line 571
    .line 572
    invoke-direct {v3, v8}, Ldefpackage/oy1;-><init>(Ldefpackage/br0;)V

    .line 573
    .line 574
    .line 575
    new-instance v6, Ldefpackage/fx3;

    .line 576
    .line 577
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 578
    .line 579
    .line 580
    :try_start_3
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 581
    .line 582
    .line 583
    move-result-object v9

    .line 584
    sget-object v10, Ldefpackage/lc5;->a:Ljava/lang/String;

    .line 585
    .line 586
    const-string v11, "NetworkRequestConstraintController register callback"

    .line 587
    .line 588
    invoke-virtual {v9, v10, v11}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v0, v3}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 592
    .line 593
    .line 594
    iput-boolean v5, v6, Ldefpackage/fx3;->n:Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 595
    .line 596
    goto :goto_11

    .line 597
    :catch_0
    move-exception v0

    .line 598
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    move-result-object v9

    .line 602
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v9

    .line 606
    const-string v10, "TooManyRequestsException"

    .line 607
    .line 608
    invoke-static {v9, v10, v4}, Ldefpackage/xm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    if-eqz v4, :cond_1c

    .line 613
    .line 614
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    sget-object v9, Ldefpackage/lc5;->a:Ljava/lang/String;

    .line 619
    .line 620
    const-string v10, "NetworkRequestConstraintController couldn\'t register callback"

    .line 621
    .line 622
    invoke-virtual {v4, v9, v10, v0}, Ldefpackage/cx;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 623
    .line 624
    .line 625
    new-instance v0, Ldefpackage/sc0;

    .line 626
    .line 627
    const/4 v4, 0x7

    .line 628
    invoke-direct {v0, v4}, Ldefpackage/sc0;-><init>(I)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v8, v0}, Ldefpackage/br0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    :goto_11
    new-instance v0, Ldefpackage/w90;

    .line 635
    .line 636
    invoke-direct {v0, v6, v1, v3, v5}, Ldefpackage/w90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 637
    .line 638
    .line 639
    move-object v6, v0

    .line 640
    :goto_12
    new-instance v0, Ldefpackage/il1;

    .line 641
    .line 642
    invoke-direct {v0, v5, v6}, Ldefpackage/il1;-><init>(ILdefpackage/gf1;)V

    .line 643
    .line 644
    .line 645
    iput v5, p0, Ldefpackage/r;->p:I

    .line 646
    .line 647
    invoke-static {v7, v0, p0}, Ldefpackage/jz4;->i(Ldefpackage/rq3;Ldefpackage/gf1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    if-ne p0, v2, :cond_1b

    .line 652
    .line 653
    move-object v6, v2

    .line 654
    goto :goto_14

    .line 655
    :cond_1b
    :goto_13
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 656
    .line 657
    :goto_14
    return-object v6

    .line 658
    :cond_1c
    throw v0

    .line 659
    :pswitch_6
    iget-object v0, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 660
    .line 661
    move-object v1, v0

    .line 662
    check-cast v1, Ldefpackage/oy;

    .line 663
    .line 664
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 665
    .line 666
    iget v2, p0, Ldefpackage/r;->p:I

    .line 667
    .line 668
    if-eqz v2, :cond_1e

    .line 669
    .line 670
    if-ne v2, v5, :cond_1d

    .line 671
    .line 672
    :try_start_4
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 673
    .line 674
    .line 675
    move-object p0, p1

    .line 676
    goto :goto_15

    .line 677
    :catchall_3
    move-exception v0

    .line 678
    move-object p0, v0

    .line 679
    goto :goto_16

    .line 680
    :cond_1d
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 681
    .line 682
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    goto :goto_18

    .line 686
    :cond_1e
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    iget-object v2, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v2, Ldefpackage/we0;

    .line 692
    .line 693
    :try_start_5
    iget-object v3, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v3, Ldefpackage/wf1;

    .line 696
    .line 697
    iput v5, p0, Ldefpackage/r;->p:I

    .line 698
    .line 699
    invoke-interface {v3, v2, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object p0

    .line 703
    if-ne p0, v0, :cond_1f

    .line 704
    .line 705
    move-object v6, v0

    .line 706
    goto :goto_18

    .line 707
    :cond_1f
    :goto_15
    invoke-virtual {v1, p0}, Ldefpackage/oy;->a(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 708
    .line 709
    .line 710
    goto :goto_17

    .line 711
    :goto_16
    invoke-virtual {v1, p0}, Ldefpackage/oy;->b(Ljava/lang/Throwable;)V

    .line 712
    .line 713
    .line 714
    goto :goto_17

    .line 715
    :catch_1
    iput-boolean v5, v1, Ldefpackage/oy;->d:Z

    .line 716
    .line 717
    iget-object p0, v1, Ldefpackage/oy;->b:Ldefpackage/ry;

    .line 718
    .line 719
    if-eqz p0, :cond_20

    .line 720
    .line 721
    iget-object p0, p0, Ldefpackage/ry;->o:Ldefpackage/qy;

    .line 722
    .line 723
    invoke-virtual {p0, v5}, Ldefpackage/g2;->cancel(Z)Z

    .line 724
    .line 725
    .line 726
    move-result p0

    .line 727
    if-eqz p0, :cond_20

    .line 728
    .line 729
    iput-object v6, v1, Ldefpackage/oy;->a:Ljava/lang/Object;

    .line 730
    .line 731
    iput-object v6, v1, Ldefpackage/oy;->b:Ldefpackage/ry;

    .line 732
    .line 733
    iput-object v6, v1, Ldefpackage/oy;->c:Ldefpackage/n04;

    .line 734
    .line 735
    :cond_20
    :goto_17
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 736
    .line 737
    :goto_18
    return-object v6

    .line 738
    :pswitch_7
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 739
    .line 740
    iget v1, p0, Ldefpackage/r;->p:I

    .line 741
    .line 742
    if-eqz v1, :cond_22

    .line 743
    .line 744
    if-ne v1, v5, :cond_21

    .line 745
    .line 746
    iget-object v1, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v1, Ldefpackage/xv;

    .line 749
    .line 750
    iget-object v2, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v2, Ldefpackage/y00;

    .line 753
    .line 754
    :try_start_6
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 755
    .line 756
    .line 757
    move-object v3, p1

    .line 758
    goto :goto_1a

    .line 759
    :catchall_4
    move-exception v0

    .line 760
    move-object p0, v0

    .line 761
    goto :goto_1d

    .line 762
    :cond_21
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 763
    .line 764
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    goto :goto_1c

    .line 768
    :cond_22
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    iget-object v1, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 772
    .line 773
    move-object v2, v1

    .line 774
    check-cast v2, Ldefpackage/aw;

    .line 775
    .line 776
    :try_start_7
    new-instance v1, Ldefpackage/xv;

    .line 777
    .line 778
    invoke-direct {v1, v2}, Ldefpackage/xv;-><init>(Ldefpackage/aw;)V

    .line 779
    .line 780
    .line 781
    :cond_23
    :goto_19
    iput-object v2, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 782
    .line 783
    iput-object v1, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 784
    .line 785
    iput v5, p0, Ldefpackage/r;->p:I

    .line 786
    .line 787
    invoke-virtual {v1, p0}, Ldefpackage/xv;->b(Ldefpackage/wd0;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    if-ne v3, v0, :cond_24

    .line 792
    .line 793
    move-object v6, v0

    .line 794
    goto :goto_1c

    .line 795
    :cond_24
    :goto_1a
    check-cast v3, Ljava/lang/Boolean;

    .line 796
    .line 797
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 798
    .line 799
    .line 800
    move-result v3

    .line 801
    if-eqz v3, :cond_26

    .line 802
    .line 803
    invoke-virtual {v1}, Ldefpackage/xv;->c()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    check-cast v3, Ldefpackage/j15;

    .line 808
    .line 809
    sget-object v3, Ldefpackage/zi1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 810
    .line 811
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 812
    .line 813
    .line 814
    sget-object v3, Ldefpackage/jh4;->c:Ljava/lang/Object;

    .line 815
    .line 816
    monitor-enter v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 817
    :try_start_8
    sget-object v7, Ldefpackage/jh4;->j:Ldefpackage/yi1;

    .line 818
    .line 819
    iget-object v7, v7, Ldefpackage/a13;->h:Ldefpackage/x03;

    .line 820
    .line 821
    if-eqz v7, :cond_25

    .line 822
    .line 823
    invoke-virtual {v7}, Ldefpackage/x03;->h()Z

    .line 824
    .line 825
    .line 826
    move-result v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 827
    if-ne v7, v5, :cond_25

    .line 828
    .line 829
    move v7, v5

    .line 830
    goto :goto_1b

    .line 831
    :cond_25
    move v7, v4

    .line 832
    :goto_1b
    :try_start_9
    monitor-exit v3

    .line 833
    if-eqz v7, :cond_23

    .line 834
    .line 835
    invoke-static {}, Ldefpackage/jh4;->a()V

    .line 836
    .line 837
    .line 838
    goto :goto_19

    .line 839
    :catchall_5
    move-exception v0

    .line 840
    move-object p0, v0

    .line 841
    monitor-exit v3

    .line 842
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 843
    :cond_26
    invoke-interface {v2, v6}, Ldefpackage/y00;->f(Ljava/util/concurrent/CancellationException;)V

    .line 844
    .line 845
    .line 846
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 847
    .line 848
    :goto_1c
    return-object v6

    .line 849
    :goto_1d
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 850
    :catchall_6
    move-exception v0

    .line 851
    instance-of v1, p0, Ljava/util/concurrent/CancellationException;

    .line 852
    .line 853
    if-eqz v1, :cond_27

    .line 854
    .line 855
    move-object v6, p0

    .line 856
    check-cast v6, Ljava/util/concurrent/CancellationException;

    .line 857
    .line 858
    :cond_27
    if-nez v6, :cond_28

    .line 859
    .line 860
    const-string v1, "Channel was consumed, consumer had failed"

    .line 861
    .line 862
    new-instance v6, Ljava/util/concurrent/CancellationException;

    .line 863
    .line 864
    invoke-direct {v6, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v6, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 868
    .line 869
    .line 870
    :cond_28
    invoke-interface {v2, v6}, Ldefpackage/y00;->f(Ljava/util/concurrent/CancellationException;)V

    .line 871
    .line 872
    .line 873
    throw v0

    .line 874
    :pswitch_8
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 875
    .line 876
    iget v1, p0, Ldefpackage/r;->p:I

    .line 877
    .line 878
    if-eqz v1, :cond_2a

    .line 879
    .line 880
    if-ne v1, v5, :cond_29

    .line 881
    .line 882
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    goto :goto_1e

    .line 886
    :cond_29
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 887
    .line 888
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    goto :goto_1f

    .line 892
    :cond_2a
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v1, Ldefpackage/rm2;

    .line 898
    .line 899
    iget-object v2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v2, Ldefpackage/q02;

    .line 902
    .line 903
    iput v5, p0, Ldefpackage/r;->p:I

    .line 904
    .line 905
    invoke-virtual {v1, v2, p0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    if-ne v1, v0, :cond_2b

    .line 910
    .line 911
    move-object v6, v0

    .line 912
    goto :goto_1f

    .line 913
    :cond_2b
    :goto_1e
    iget-object p0, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast p0, Ldefpackage/as0;

    .line 916
    .line 917
    if-eqz p0, :cond_2c

    .line 918
    .line 919
    invoke-interface {p0}, Ldefpackage/as0;->a()V

    .line 920
    .line 921
    .line 922
    :cond_2c
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 923
    .line 924
    :goto_1f
    return-object v6

    .line 925
    :pswitch_9
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 926
    .line 927
    iget v1, p0, Ldefpackage/r;->p:I

    .line 928
    .line 929
    if-eqz v1, :cond_2e

    .line 930
    .line 931
    if-ne v1, v5, :cond_2d

    .line 932
    .line 933
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    goto :goto_20

    .line 937
    :cond_2d
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 938
    .line 939
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    goto :goto_21

    .line 943
    :cond_2e
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 944
    .line 945
    .line 946
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v1, Ldefpackage/ml3;

    .line 949
    .line 950
    iget-object v3, v1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 951
    .line 952
    move-object v9, v3

    .line 953
    check-cast v9, Ldefpackage/k13;

    .line 954
    .line 955
    iget-object v3, v1, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 956
    .line 957
    move-object v11, v3

    .line 958
    check-cast v11, Ldefpackage/sm0;

    .line 959
    .line 960
    iget-object v3, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 961
    .line 962
    move-object v8, v3

    .line 963
    check-cast v8, Ldefpackage/h13;

    .line 964
    .line 965
    new-instance v10, Ldefpackage/r;

    .line 966
    .line 967
    iget-object v3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 968
    .line 969
    check-cast v3, Ldefpackage/wf1;

    .line 970
    .line 971
    invoke-direct {v10, v1, v3, v6, v2}, Ldefpackage/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 972
    .line 973
    .line 974
    iput v5, p0, Ldefpackage/r;->p:I

    .line 975
    .line 976
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    new-instance v7, Ldefpackage/j13;

    .line 980
    .line 981
    const/4 v12, 0x0

    .line 982
    invoke-direct/range {v7 .. v12}, Ldefpackage/j13;-><init>(Ldefpackage/h13;Ldefpackage/k13;Ldefpackage/r;Ldefpackage/sm0;Ldefpackage/vd0;)V

    .line 983
    .line 984
    .line 985
    invoke-static {v7, p0}, Ldefpackage/te5;->j(Ldefpackage/wf1;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object p0

    .line 989
    if-ne p0, v0, :cond_2f

    .line 990
    .line 991
    move-object v6, v0

    .line 992
    goto :goto_21

    .line 993
    :cond_2f
    :goto_20
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 994
    .line 995
    :goto_21
    return-object v6

    .line 996
    :pswitch_a
    iget-object v0, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 997
    .line 998
    check-cast v0, Ldefpackage/ml3;

    .line 999
    .line 1000
    iget-object v0, v0, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 1001
    .line 1002
    move-object v1, v0

    .line 1003
    check-cast v1, Ldefpackage/zd3;

    .line 1004
    .line 1005
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 1006
    .line 1007
    iget v2, p0, Ldefpackage/r;->p:I

    .line 1008
    .line 1009
    if-eqz v2, :cond_31

    .line 1010
    .line 1011
    if-ne v2, v5, :cond_30

    .line 1012
    .line 1013
    :try_start_b
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1014
    .line 1015
    .line 1016
    goto :goto_22

    .line 1017
    :catchall_7
    move-exception v0

    .line 1018
    move-object p0, v0

    .line 1019
    goto :goto_24

    .line 1020
    :cond_30
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1021
    .line 1022
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    goto :goto_23

    .line 1026
    :cond_31
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    iget-object v2, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v2, Ldefpackage/q64;

    .line 1032
    .line 1033
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1034
    .line 1035
    invoke-virtual {v1, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    :try_start_c
    iget-object v3, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v3, Ldefpackage/wf1;

    .line 1041
    .line 1042
    iput v5, p0, Ldefpackage/r;->p:I

    .line 1043
    .line 1044
    invoke-interface {v3, v2, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 1048
    if-ne p0, v0, :cond_32

    .line 1049
    .line 1050
    move-object v6, v0

    .line 1051
    goto :goto_23

    .line 1052
    :cond_32
    :goto_22
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1053
    .line 1054
    invoke-virtual {v1, p0}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 1055
    .line 1056
    .line 1057
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1058
    .line 1059
    :goto_23
    return-object v6

    .line 1060
    :goto_24
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1061
    .line 1062
    invoke-virtual {v1, v0}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    throw p0

    .line 1066
    :pswitch_b
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 1067
    .line 1068
    iget v1, p0, Ldefpackage/r;->p:I

    .line 1069
    .line 1070
    if-eqz v1, :cond_34

    .line 1071
    .line 1072
    if-ne v1, v5, :cond_33

    .line 1073
    .line 1074
    iget-object p0, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 1075
    .line 1076
    check-cast p0, Ldefpackage/jx3;

    .line 1077
    .line 1078
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1079
    .line 1080
    .line 1081
    move-object v0, p1

    .line 1082
    goto :goto_25

    .line 1083
    :cond_33
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1084
    .line 1085
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_26

    .line 1089
    :cond_34
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1090
    .line 1091
    .line 1092
    iget-object v1, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 1093
    .line 1094
    check-cast v1, Ldefpackage/jx3;

    .line 1095
    .line 1096
    iget-object v2, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 1097
    .line 1098
    check-cast v2, Ldefpackage/wn3;

    .line 1099
    .line 1100
    iput-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 1101
    .line 1102
    iput v5, p0, Ldefpackage/r;->p:I

    .line 1103
    .line 1104
    invoke-virtual {v2, p0}, Ldefpackage/wn3;->a(Ldefpackage/wd0;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object p0

    .line 1108
    if-ne p0, v0, :cond_35

    .line 1109
    .line 1110
    move-object v6, v0

    .line 1111
    goto :goto_26

    .line 1112
    :cond_35
    move-object v0, p0

    .line 1113
    move-object p0, v1

    .line 1114
    :goto_25
    iput-object v0, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1115
    .line 1116
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1117
    .line 1118
    :goto_26
    return-object v6

    .line 1119
    :pswitch_c
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1120
    .line 1121
    sget-object v1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 1122
    .line 1123
    iget v3, p0, Ldefpackage/r;->p:I

    .line 1124
    .line 1125
    if-eqz v3, :cond_38

    .line 1126
    .line 1127
    if-ne v3, v5, :cond_37

    .line 1128
    .line 1129
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1130
    .line 1131
    .line 1132
    :cond_36
    move-object v6, v0

    .line 1133
    goto :goto_28

    .line 1134
    :cond_37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1135
    .line 1136
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_28

    .line 1140
    :cond_38
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1141
    .line 1142
    .line 1143
    iget-object v3, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 1144
    .line 1145
    check-cast v3, Ldefpackage/we0;

    .line 1146
    .line 1147
    iget-object v4, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 1148
    .line 1149
    check-cast v4, Ldefpackage/q81;

    .line 1150
    .line 1151
    iget-object v7, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v7, Ldefpackage/z00;

    .line 1154
    .line 1155
    iget-object v8, v7, Ldefpackage/z00;->n:Ldefpackage/ne0;

    .line 1156
    .line 1157
    iget v9, v7, Ldefpackage/z00;->o:I

    .line 1158
    .line 1159
    const/4 v10, -0x3

    .line 1160
    if-ne v9, v10, :cond_39

    .line 1161
    .line 1162
    const/4 v9, -0x2

    .line 1163
    :cond_39
    iget-object v10, v7, Ldefpackage/z00;->p:Ldefpackage/wv;

    .line 1164
    .line 1165
    sget-object v11, Ldefpackage/ze0;->p:Ldefpackage/ze0;

    .line 1166
    .line 1167
    new-instance v12, Ldefpackage/p;

    .line 1168
    .line 1169
    invoke-direct {v12, v7, v6, v2}, Ldefpackage/p;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 1170
    .line 1171
    .line 1172
    invoke-static {v9, v2, v10}, Ldefpackage/su3;->a(IILdefpackage/wv;)Ldefpackage/aw;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v2

    .line 1176
    invoke-interface {v3}, Ldefpackage/we0;->e()Ldefpackage/ne0;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v3

    .line 1180
    invoke-static {v3, v8, v5}, Ldefpackage/jz4;->t(Ldefpackage/ne0;Ldefpackage/ne0;Z)Ldefpackage/ne0;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v3

    .line 1184
    sget-object v6, Ldefpackage/rr0;->a:Ldefpackage/rm0;

    .line 1185
    .line 1186
    if-eq v3, v6, :cond_3a

    .line 1187
    .line 1188
    sget-object v7, Ldefpackage/fz0;->R:Ldefpackage/fz0;

    .line 1189
    .line 1190
    invoke-interface {v3, v7}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v7

    .line 1194
    if-nez v7, :cond_3a

    .line 1195
    .line 1196
    invoke-interface {v3, v6}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v3

    .line 1200
    :cond_3a
    new-instance v6, Ldefpackage/rq3;

    .line 1201
    .line 1202
    invoke-direct {v6, v3, v2}, Ldefpackage/rq3;-><init>(Ldefpackage/ne0;Ldefpackage/aw;)V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v6, v11, v6, v12}, Ldefpackage/c0;->l0(Ldefpackage/ze0;Ldefpackage/c0;Ldefpackage/wf1;)V

    .line 1206
    .line 1207
    .line 1208
    iput v5, p0, Ldefpackage/r;->p:I

    .line 1209
    .line 1210
    invoke-static {v4, v6, v5, p0}, Ldefpackage/jz4;->q(Ldefpackage/q81;Ldefpackage/y00;ZLdefpackage/wd0;)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object p0

    .line 1214
    if-ne p0, v1, :cond_3b

    .line 1215
    .line 1216
    goto :goto_27

    .line 1217
    :cond_3b
    move-object p0, v0

    .line 1218
    :goto_27
    if-ne p0, v1, :cond_36

    .line 1219
    .line 1220
    move-object v6, v1

    .line 1221
    :goto_28
    return-object v6

    .line 1222
    :pswitch_d
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1223
    .line 1224
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v1, Ldefpackage/cv;

    .line 1227
    .line 1228
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 1229
    .line 1230
    iget v7, p0, Ldefpackage/r;->p:I

    .line 1231
    .line 1232
    if-eqz v7, :cond_3e

    .line 1233
    .line 1234
    if-ne v7, v5, :cond_3d

    .line 1235
    .line 1236
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1237
    .line 1238
    .line 1239
    :cond_3c
    move-object v6, v0

    .line 1240
    goto/16 :goto_2f

    .line 1241
    .line 1242
    :cond_3d
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1243
    .line 1244
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    goto/16 :goto_2f

    .line 1248
    .line 1249
    :cond_3e
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1250
    .line 1251
    .line 1252
    iget-object v7, v1, Ldefpackage/cv;->B:Ldefpackage/gd0;

    .line 1253
    .line 1254
    new-instance v6, Ldefpackage/av;

    .line 1255
    .line 1256
    iget-object v8, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 1257
    .line 1258
    check-cast v8, Ldefpackage/f63;

    .line 1259
    .line 1260
    iget-object v9, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 1261
    .line 1262
    check-cast v9, Ldefpackage/fa;

    .line 1263
    .line 1264
    invoke-direct {v6, v1, v8, v9}, Ldefpackage/av;-><init>(Ldefpackage/cv;Ldefpackage/f63;Ldefpackage/fa;)V

    .line 1265
    .line 1266
    .line 1267
    iput v5, p0, Ldefpackage/r;->p:I

    .line 1268
    .line 1269
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v6}, Ldefpackage/av;->invoke()Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v1

    .line 1276
    move-object v8, v1

    .line 1277
    check-cast v8, Ldefpackage/wv3;

    .line 1278
    .line 1279
    if-eqz v8, :cond_45

    .line 1280
    .line 1281
    const-wide/16 v11, 0x0

    .line 1282
    .line 1283
    const/4 v13, 0x3

    .line 1284
    const-wide/16 v9, 0x0

    .line 1285
    .line 1286
    invoke-static/range {v7 .. v13}, Ldefpackage/gd0;->s0(Ldefpackage/gd0;Ldefpackage/wv3;JJI)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v1

    .line 1290
    if-nez v1, :cond_45

    .line 1291
    .line 1292
    new-instance v1, Ldefpackage/cz;

    .line 1293
    .line 1294
    invoke-static {p0}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 1295
    .line 1296
    .line 1297
    move-result-object p0

    .line 1298
    invoke-direct {v1, v5, p0}, Ldefpackage/cz;-><init>(ILdefpackage/vd0;)V

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v1}, Ldefpackage/cz;->u()V

    .line 1302
    .line 1303
    .line 1304
    new-instance p0, Ldefpackage/cd0;

    .line 1305
    .line 1306
    invoke-direct {p0, v6, v1}, Ldefpackage/cd0;-><init>(Ldefpackage/av;Ldefpackage/cz;)V

    .line 1307
    .line 1308
    .line 1309
    iget-object v8, v7, Ldefpackage/gd0;->G:Ldefpackage/zg5;

    .line 1310
    .line 1311
    iget-object v9, v8, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 1312
    .line 1313
    check-cast v9, Ldefpackage/f13;

    .line 1314
    .line 1315
    invoke-virtual {v6}, Ldefpackage/av;->invoke()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v6

    .line 1319
    check-cast v6, Ldefpackage/wv3;

    .line 1320
    .line 1321
    if-nez v6, :cond_3f

    .line 1322
    .line 1323
    invoke-virtual {v1, v0}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 1324
    .line 1325
    .line 1326
    goto :goto_2d

    .line 1327
    :cond_3f
    new-instance v10, Ldefpackage/o;

    .line 1328
    .line 1329
    invoke-direct {v10, v3, v8, p0}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v1, v10}, Ldefpackage/cz;->w(Ldefpackage/if1;)V

    .line 1333
    .line 1334
    .line 1335
    iget v3, v9, Ldefpackage/f13;->p:I

    .line 1336
    .line 1337
    invoke-static {v4, v3}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    iget v8, v3, Ldefpackage/h02;->n:I

    .line 1342
    .line 1343
    iget v3, v3, Ldefpackage/h02;->o:I

    .line 1344
    .line 1345
    if-gt v8, v3, :cond_43

    .line 1346
    .line 1347
    :goto_29
    iget-object v10, v9, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 1348
    .line 1349
    aget-object v10, v10, v3

    .line 1350
    .line 1351
    check-cast v10, Ldefpackage/cd0;

    .line 1352
    .line 1353
    iget-object v10, v10, Ldefpackage/cd0;->a:Ldefpackage/av;

    .line 1354
    .line 1355
    invoke-virtual {v10}, Ldefpackage/av;->invoke()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v10

    .line 1359
    check-cast v10, Ldefpackage/wv3;

    .line 1360
    .line 1361
    if-nez v10, :cond_40

    .line 1362
    .line 1363
    goto :goto_2b

    .line 1364
    :cond_40
    invoke-virtual {v6, v10}, Ldefpackage/wv3;->c(Ldefpackage/wv3;)Ldefpackage/wv3;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v11

    .line 1368
    invoke-virtual {v11, v6}, Ldefpackage/wv3;->equals(Ljava/lang/Object;)Z

    .line 1369
    .line 1370
    .line 1371
    move-result v12

    .line 1372
    if-eqz v12, :cond_41

    .line 1373
    .line 1374
    add-int/2addr v3, v5

    .line 1375
    invoke-virtual {v9, v3, p0}, Ldefpackage/f13;->a(ILjava/lang/Object;)V

    .line 1376
    .line 1377
    .line 1378
    goto :goto_2c

    .line 1379
    :cond_41
    invoke-virtual {v11, v10}, Ldefpackage/wv3;->equals(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v10

    .line 1383
    if-nez v10, :cond_42

    .line 1384
    .line 1385
    new-instance v10, Ljava/util/concurrent/CancellationException;

    .line 1386
    .line 1387
    const-string v11, "bringIntoView call interrupted by a newer, non-overlapping call"

    .line 1388
    .line 1389
    invoke-direct {v10, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    iget v11, v9, Ldefpackage/f13;->p:I

    .line 1393
    .line 1394
    sub-int/2addr v11, v5

    .line 1395
    if-gt v11, v3, :cond_42

    .line 1396
    .line 1397
    :goto_2a
    iget-object v12, v9, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 1398
    .line 1399
    aget-object v12, v12, v3

    .line 1400
    .line 1401
    check-cast v12, Ldefpackage/cd0;

    .line 1402
    .line 1403
    iget-object v12, v12, Ldefpackage/cd0;->b:Ldefpackage/cz;

    .line 1404
    .line 1405
    invoke-virtual {v12, v10}, Ldefpackage/cz;->r(Ljava/lang/Throwable;)Z

    .line 1406
    .line 1407
    .line 1408
    if-eq v11, v3, :cond_42

    .line 1409
    .line 1410
    add-int/lit8 v11, v11, 0x1

    .line 1411
    .line 1412
    goto :goto_2a

    .line 1413
    :cond_42
    :goto_2b
    if-eq v3, v8, :cond_43

    .line 1414
    .line 1415
    add-int/lit8 v3, v3, -0x1

    .line 1416
    .line 1417
    goto :goto_29

    .line 1418
    :cond_43
    invoke-virtual {v9, v4, p0}, Ldefpackage/f13;->a(ILjava/lang/Object;)V

    .line 1419
    .line 1420
    .line 1421
    :goto_2c
    iget-boolean p0, v7, Ldefpackage/gd0;->J:Z

    .line 1422
    .line 1423
    if-nez p0, :cond_44

    .line 1424
    .line 1425
    const-wide/16 v3, 0x0

    .line 1426
    .line 1427
    invoke-virtual {v7, v3, v4}, Ldefpackage/gd0;->t0(J)V

    .line 1428
    .line 1429
    .line 1430
    :cond_44
    :goto_2d
    invoke-virtual {v1}, Ldefpackage/cz;->q()Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object p0

    .line 1434
    if-ne p0, v2, :cond_45

    .line 1435
    .line 1436
    goto :goto_2e

    .line 1437
    :cond_45
    move-object p0, v0

    .line 1438
    :goto_2e
    if-ne p0, v2, :cond_3c

    .line 1439
    .line 1440
    move-object v6, v2

    .line 1441
    :goto_2f
    return-object v6

    .line 1442
    :pswitch_e
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 1443
    .line 1444
    iget v1, p0, Ldefpackage/r;->p:I

    .line 1445
    .line 1446
    if-eqz v1, :cond_47

    .line 1447
    .line 1448
    if-ne v1, v5, :cond_46

    .line 1449
    .line 1450
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1451
    .line 1452
    .line 1453
    goto :goto_30

    .line 1454
    :cond_46
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1455
    .line 1456
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    goto :goto_31

    .line 1460
    :cond_47
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 1461
    .line 1462
    .line 1463
    iget-object v1, p0, Ldefpackage/r;->q:Ljava/lang/Object;

    .line 1464
    .line 1465
    check-cast v1, Ldefpackage/rm2;

    .line 1466
    .line 1467
    iget-object v2, p0, Ldefpackage/r;->r:Ljava/lang/Object;

    .line 1468
    .line 1469
    check-cast v2, Ldefpackage/aq3;

    .line 1470
    .line 1471
    iput v5, p0, Ldefpackage/r;->p:I

    .line 1472
    .line 1473
    invoke-virtual {v1, v2, p0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v1

    .line 1477
    if-ne v1, v0, :cond_48

    .line 1478
    .line 1479
    move-object v6, v0

    .line 1480
    goto :goto_31

    .line 1481
    :cond_48
    :goto_30
    iget-object p0, p0, Ldefpackage/r;->s:Ljava/lang/Object;

    .line 1482
    .line 1483
    check-cast p0, Ldefpackage/as0;

    .line 1484
    .line 1485
    if-eqz p0, :cond_49

    .line 1486
    .line 1487
    invoke-interface {p0}, Ldefpackage/as0;->a()V

    .line 1488
    .line 1489
    .line 1490
    :cond_49
    sget-object v6, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1491
    .line 1492
    :goto_31
    return-object v6

    .line 1493
    :pswitch_data_0
    .packed-switch 0x0
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
