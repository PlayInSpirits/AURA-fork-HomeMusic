.class public final synthetic Loc3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    iput p1, p0, Loc3;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Loc3;->o:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Loc3;->n:I

    .line 4
    .line 5
    sget-object v2, Lj15;->a:Lj15;

    .line 6
    .line 7
    iget-object v0, v0, Loc3;->o:Ljava/util/ArrayList;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Lig3;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Ljg3;

    .line 28
    .line 29
    invoke-static {v1, v5}, Lig3;->n(Lig3;Ljg3;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v2

    .line 36
    :pswitch_0
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, Lig3;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/4 v5, 0x0

    .line 45
    :goto_1
    if-ge v5, v4, :cond_b

    .line 46
    .line 47
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Lxi2;

    .line 52
    .line 53
    iget-object v7, v6, Lxi2;->b:Ljava/util/List;

    .line 54
    .line 55
    iget-boolean v8, v6, Lxi2;->i:Z

    .line 56
    .line 57
    iget v9, v6, Lxi2;->m:I

    .line 58
    .line 59
    const/high16 v10, -0x80000000

    .line 60
    .line 61
    if-eq v9, v10, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    const-string v9, "position() should be called first"

    .line 65
    .line 66
    invoke-static {v9}, Lfz1;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    const/4 v10, 0x0

    .line 74
    :goto_3
    if-ge v10, v9, :cond_a

    .line 75
    .line 76
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    check-cast v11, Ljg3;

    .line 81
    .line 82
    iget-object v12, v6, Lxi2;->k:[I

    .line 83
    .line 84
    mul-int/lit8 v13, v10, 0x2

    .line 85
    .line 86
    aget v14, v12, v13

    .line 87
    .line 88
    add-int/lit8 v13, v13, 0x1

    .line 89
    .line 90
    aget v12, v12, v13

    .line 91
    .line 92
    int-to-long v13, v14

    .line 93
    const/16 v15, 0x20

    .line 94
    .line 95
    shl-long/2addr v13, v15

    .line 96
    move/from16 p0, v4

    .line 97
    .line 98
    int-to-long v3, v12

    .line 99
    const-wide v16, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    and-long v3, v3, v16

    .line 105
    .line 106
    or-long/2addr v3, v13

    .line 107
    iget-boolean v12, v6, Lxi2;->h:Z

    .line 108
    .line 109
    if-eqz v12, :cond_6

    .line 110
    .line 111
    if-eqz v8, :cond_2

    .line 112
    .line 113
    shr-long v12, v3, v15

    .line 114
    .line 115
    long-to-int v12, v12

    .line 116
    goto :goto_5

    .line 117
    :cond_2
    shr-long v12, v3, v15

    .line 118
    .line 119
    long-to-int v12, v12

    .line 120
    iget v13, v6, Lxi2;->m:I

    .line 121
    .line 122
    sub-int/2addr v13, v12

    .line 123
    if-eqz v8, :cond_3

    .line 124
    .line 125
    iget v12, v11, Ljg3;->o:I

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_3
    iget v12, v11, Ljg3;->n:I

    .line 129
    .line 130
    :goto_4
    sub-int v12, v13, v12

    .line 131
    .line 132
    :goto_5
    if-eqz v8, :cond_5

    .line 133
    .line 134
    and-long v3, v3, v16

    .line 135
    .line 136
    long-to-int v3, v3

    .line 137
    iget v4, v6, Lxi2;->m:I

    .line 138
    .line 139
    sub-int/2addr v4, v3

    .line 140
    if-eqz v8, :cond_4

    .line 141
    .line 142
    iget v3, v11, Ljg3;->o:I

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_4
    iget v3, v11, Ljg3;->n:I

    .line 146
    .line 147
    :goto_6
    sub-int/2addr v4, v3

    .line 148
    goto :goto_7

    .line 149
    :cond_5
    and-long v3, v3, v16

    .line 150
    .line 151
    long-to-int v4, v3

    .line 152
    :goto_7
    int-to-long v12, v12

    .line 153
    shl-long/2addr v12, v15

    .line 154
    int-to-long v3, v4

    .line 155
    and-long v3, v3, v16

    .line 156
    .line 157
    or-long/2addr v3, v12

    .line 158
    :cond_6
    iget-wide v12, v6, Lxi2;->c:J

    .line 159
    .line 160
    invoke-static {v3, v4, v12, v13}, Lg02;->c(JJ)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    const/4 v12, 0x0

    .line 165
    if-eqz v8, :cond_7

    .line 166
    .line 167
    sget-object v13, Lkg3;->a:Lk52;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v11}, Lig3;->a(Lig3;Ljg3;)V

    .line 173
    .line 174
    .line 175
    iget-wide v14, v11, Ljg3;->r:J

    .line 176
    .line 177
    invoke-static {v3, v4, v14, v15}, Lg02;->c(JJ)J

    .line 178
    .line 179
    .line 180
    move-result-wide v3

    .line 181
    invoke-virtual {v11, v3, v4, v12, v13}, Ljg3;->N(JFLif1;)V

    .line 182
    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_7
    sget-object v13, Lkg3;->a:Lk52;

    .line 186
    .line 187
    invoke-virtual {v1}, Lig3;->c()Lr62;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    move/from16 p1, v15

    .line 192
    .line 193
    sget-object v15, Lr62;->n:Lr62;

    .line 194
    .line 195
    if-eq v14, v15, :cond_8

    .line 196
    .line 197
    invoke-virtual {v1}, Lig3;->e()I

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    if-nez v14, :cond_9

    .line 202
    .line 203
    :cond_8
    move v15, v12

    .line 204
    move-object v12, v13

    .line 205
    goto :goto_8

    .line 206
    :cond_9
    invoke-virtual {v1}, Lig3;->e()I

    .line 207
    .line 208
    .line 209
    move-result v14

    .line 210
    iget v15, v11, Ljg3;->n:I

    .line 211
    .line 212
    sub-int/2addr v14, v15

    .line 213
    move-object/from16 v18, v13

    .line 214
    .line 215
    shr-long v12, v3, p1

    .line 216
    .line 217
    long-to-int v12, v12

    .line 218
    sub-int/2addr v14, v12

    .line 219
    and-long v3, v3, v16

    .line 220
    .line 221
    long-to-int v3, v3

    .line 222
    int-to-long v12, v14

    .line 223
    shl-long v12, v12, p1

    .line 224
    .line 225
    int-to-long v3, v3

    .line 226
    and-long v3, v3, v16

    .line 227
    .line 228
    or-long/2addr v3, v12

    .line 229
    invoke-static {v1, v11}, Lig3;->a(Lig3;Ljg3;)V

    .line 230
    .line 231
    .line 232
    iget-wide v12, v11, Ljg3;->r:J

    .line 233
    .line 234
    invoke-static {v3, v4, v12, v13}, Lg02;->c(JJ)J

    .line 235
    .line 236
    .line 237
    move-result-wide v3

    .line 238
    move-object/from16 v12, v18

    .line 239
    .line 240
    const/4 v15, 0x0

    .line 241
    invoke-virtual {v11, v3, v4, v15, v12}, Ljg3;->N(JFLif1;)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :goto_8
    invoke-static {v1, v11}, Lig3;->a(Lig3;Ljg3;)V

    .line 246
    .line 247
    .line 248
    iget-wide v13, v11, Ljg3;->r:J

    .line 249
    .line 250
    invoke-static {v3, v4, v13, v14}, Lg02;->c(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    invoke-virtual {v11, v3, v4, v15, v12}, Ljg3;->N(JFLif1;)V

    .line 255
    .line 256
    .line 257
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 258
    .line 259
    move/from16 v4, p0

    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_a
    move/from16 p0, v4

    .line 264
    .line 265
    add-int/lit8 v5, v5, 0x1

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :cond_b
    return-object v2

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
