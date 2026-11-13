.class public final synthetic Ldefpackage/rs0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 10
    iput p1, p0, Ldefpackage/rs0;->n:I

    iput-object p2, p0, Ldefpackage/rs0;->o:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/ss0;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Ldefpackage/rs0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ldefpackage/x34;

    .line 2
    .line 3
    const-string v0, "DELETE FROM playlist WHERE id = ?"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p1}, Ldefpackage/z34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ldefpackage/x34;

    .line 2
    .line 3
    const-string v0, "SELECT coverArt FROM playlist WHERE id = ?"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p1}, Ldefpackage/z34;->O()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    invoke-interface {p1, p0}, Ldefpackage/z34;->isNull(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-interface {p1, p0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 47
    .line 48
    .line 49
    throw p0
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ldefpackage/x34;

    .line 2
    .line 3
    const-string v0, "SELECT isUniversal FROM playlist WHERE id = ?"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_4

    .line 20
    :cond_0
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p1}, Ldefpackage/z34;->O()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    invoke-interface {p1, p0}, Ldefpackage/z34;->isNull(I)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    move-object v2, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-interface {p1, p0}, Ldefpackage/z34;->getLong(I)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    long-to-int v2, v2

    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :goto_1
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move v0, p0

    .line 59
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :goto_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 68
    .line 69
    .line 70
    throw p0
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ldefpackage/x34;

    .line 2
    .line 3
    const-string v0, "DELETE FROM playlist_song WHERE playlist_id = ?"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p1}, Ldefpackage/z34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ldefpackage/x34;

    .line 4
    .line 5
    const-string v1, "SELECT * FROM playlist_song WHERE playlist_id = ?"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object/from16 v0, p0

    .line 12
    .line 13
    iget-object v0, v0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    :try_start_0
    invoke-interface {v1, v2}, Ldefpackage/z34;->e(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto/16 :goto_c

    .line 24
    .line 25
    :cond_0
    invoke-interface {v1, v2, v0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const-string v0, "playlist_id"

    .line 29
    .line 30
    invoke-static {v1, v0}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const-string v2, "id"

    .line 35
    .line 36
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const-string v3, "title"

    .line 41
    .line 42
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const-string v4, "artist"

    .line 47
    .line 48
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const-string v5, "album"

    .line 53
    .line 54
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const-string v6, "track"

    .line 59
    .line 60
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const-string v7, "cover_art_id"

    .line 65
    .line 66
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const-string v8, "duration"

    .line 71
    .line 72
    invoke-static {v1, v8}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    const-string v9, "album_id"

    .line 77
    .line 78
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    const-string v10, "artist_id"

    .line 83
    .line 84
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    new-instance v11, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    if-eqz v12, :cond_b

    .line 98
    .line 99
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-eqz v12, :cond_1

    .line 104
    .line 105
    const/4 v15, 0x0

    .line 106
    goto :goto_2

    .line 107
    :cond_1
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    move-object v15, v12

    .line 112
    :goto_2
    invoke-interface {v1, v2}, Ldefpackage/z34;->isNull(I)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-eqz v12, :cond_2

    .line 117
    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_2
    invoke-interface {v1, v2}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    move-object/from16 v16, v12

    .line 126
    .line 127
    :goto_3
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-eqz v12, :cond_3

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_3
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    move-object/from16 v17, v12

    .line 141
    .line 142
    :goto_4
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-eqz v12, :cond_4

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_4
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    move-object/from16 v18, v12

    .line 156
    .line 157
    :goto_5
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_5

    .line 162
    .line 163
    const/16 v19, 0x0

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_5
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    move-object/from16 v19, v12

    .line 171
    .line 172
    :goto_6
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    if-eqz v12, :cond_6

    .line 177
    .line 178
    const/16 v20, 0x0

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_6
    invoke-interface {v1, v6}, Ldefpackage/z34;->getLong(I)J

    .line 182
    .line 183
    .line 184
    move-result-wide v13

    .line 185
    long-to-int v12, v13

    .line 186
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    move-object/from16 v20, v12

    .line 191
    .line 192
    :goto_7
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-eqz v12, :cond_7

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_7
    invoke-interface {v1, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    move-object/from16 v21, v12

    .line 206
    .line 207
    :goto_8
    invoke-interface {v1, v8}, Ldefpackage/z34;->isNull(I)Z

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    if-eqz v12, :cond_8

    .line 212
    .line 213
    const/16 v22, 0x0

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_8
    invoke-interface {v1, v8}, Ldefpackage/z34;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v12

    .line 220
    long-to-int v12, v12

    .line 221
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    move-object/from16 v22, v12

    .line 226
    .line 227
    :goto_9
    invoke-interface {v1, v9}, Ldefpackage/z34;->isNull(I)Z

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    if-eqz v12, :cond_9

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_9
    invoke-interface {v1, v9}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    move-object/from16 v23, v12

    .line 241
    .line 242
    :goto_a
    invoke-interface {v1, v10}, Ldefpackage/z34;->isNull(I)Z

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    if-eqz v12, :cond_a

    .line 247
    .line 248
    const/16 v24, 0x0

    .line 249
    .line 250
    goto :goto_b

    .line 251
    :cond_a
    invoke-interface {v1, v10}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    move-object/from16 v24, v13

    .line 256
    .line 257
    :goto_b
    new-instance v14, Lcom/eddyizm/tempus/model/PlaylistSong;

    .line 258
    .line 259
    invoke-direct/range {v14 .. v24}, Lcom/eddyizm/tempus/model/PlaylistSong;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 268
    .line 269
    .line 270
    return-object v11

    .line 271
    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 272
    .line 273
    .line 274
    throw v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/rs0;->n:I

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    const-string v3, "updated_at"

    .line 8
    .line 9
    const-string v4, "structured_lyrics"

    .line 10
    .line 11
    const-string v5, "lyrics"

    .line 12
    .line 13
    const-string v6, "song_id"

    .line 14
    .line 15
    const-string v7, "SELECT * FROM lyrics_cache WHERE song_id = ?"

    .line 16
    .line 17
    sget-object v8, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 18
    .line 19
    const-string v9, "title"

    .line 20
    .line 21
    const-string v10, "artist"

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    iget-object v13, v0, Ldefpackage/rs0;->o:Ljava/lang/String;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-ge v1, v2, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v13, v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    :goto_0
    return-object v13

    .line 61
    :pswitch_0
    move-object/from16 v0, p1

    .line 62
    .line 63
    check-cast v0, Ldefpackage/q94;

    .line 64
    .line 65
    sget-object v1, Ldefpackage/o94;->a:[Ldefpackage/c42;

    .line 66
    .line 67
    sget-object v1, Ldefpackage/n94;->a:Ldefpackage/p94;

    .line 68
    .line 69
    invoke-static {v13}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v0, v1, v2}, Ldefpackage/q94;->a(Ldefpackage/p94;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object v8

    .line 77
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Ldefpackage/rs0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Ldefpackage/rs0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Ldefpackage/rs0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Ldefpackage/rs0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Ldefpackage/rs0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0

    .line 102
    :pswitch_6
    move-object/from16 v0, p1

    .line 103
    .line 104
    check-cast v0, Ldefpackage/x34;

    .line 105
    .line 106
    const-string v1, "INSERT OR IGNORE INTO pinned_playlist (playlistId) VALUES (?)"

    .line 107
    .line 108
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-nez v13, :cond_2

    .line 113
    .line 114
    :try_start_0
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 127
    .line 128
    .line 129
    return-object v12

    .line 130
    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :pswitch_7
    move-object/from16 v0, p1

    .line 135
    .line 136
    check-cast v0, Ldefpackage/x34;

    .line 137
    .line 138
    const-string v1, "DELETE FROM pinned_playlist WHERE playlistId = ?"

    .line 139
    .line 140
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-nez v13, :cond_3

    .line 145
    .line 146
    :try_start_1
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    goto :goto_4

    .line 152
    :cond_3
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :goto_3
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    .line 157
    .line 158
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 159
    .line 160
    .line 161
    return-object v12

    .line 162
    :goto_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :pswitch_8
    move-object/from16 v0, p1

    .line 167
    .line 168
    check-cast v0, Ldefpackage/x34;

    .line 169
    .line 170
    invoke-interface {v0, v7}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-nez v13, :cond_4

    .line 175
    .line 176
    :try_start_2
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :catchall_2
    move-exception v0

    .line 181
    goto/16 :goto_c

    .line 182
    .line 183
    :cond_4
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :goto_5
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_a

    .line 215
    .line 216
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-eqz v7, :cond_5

    .line 221
    .line 222
    move-object v14, v12

    .line 223
    goto :goto_6

    .line 224
    :cond_5
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    move-object v14, v0

    .line 229
    :goto_6
    invoke-interface {v1, v2}, Ldefpackage/z34;->isNull(I)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    move-object v15, v12

    .line 236
    goto :goto_7

    .line 237
    :cond_6
    invoke-interface {v1, v2}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    move-object v15, v0

    .line 242
    :goto_7
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_7

    .line 247
    .line 248
    move-object/from16 v16, v12

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_7
    invoke-interface {v1, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    move-object/from16 v16, v0

    .line 256
    .line 257
    :goto_8
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_8

    .line 262
    .line 263
    move-object/from16 v17, v12

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_8
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    move-object/from16 v17, v0

    .line 271
    .line 272
    :goto_9
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_9

    .line 277
    .line 278
    :goto_a
    move-object/from16 v18, v12

    .line 279
    .line 280
    goto :goto_b

    .line 281
    :cond_9
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    goto :goto_a

    .line 286
    :goto_b
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 287
    .line 288
    .line 289
    move-result-wide v19

    .line 290
    new-instance v13, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 291
    .line 292
    invoke-direct/range {v13 .. v20}, Lcom/eddyizm/tempus/model/LyricsCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 293
    .line 294
    .line 295
    move-object v12, v13

    .line 296
    :cond_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 297
    .line 298
    .line 299
    return-object v12

    .line 300
    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :pswitch_9
    move-object/from16 v0, p1

    .line 305
    .line 306
    check-cast v0, Ldefpackage/x34;

    .line 307
    .line 308
    invoke-interface {v0, v7}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-nez v13, :cond_b

    .line 313
    .line 314
    :try_start_3
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 315
    .line 316
    .line 317
    goto :goto_d

    .line 318
    :catchall_3
    move-exception v0

    .line 319
    goto/16 :goto_14

    .line 320
    .line 321
    :cond_b
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :goto_d
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    if-eqz v7, :cond_11

    .line 353
    .line 354
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    if-eqz v7, :cond_c

    .line 359
    .line 360
    move-object v14, v12

    .line 361
    goto :goto_e

    .line 362
    :cond_c
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object v14, v0

    .line 367
    :goto_e
    invoke-interface {v1, v2}, Ldefpackage/z34;->isNull(I)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_d

    .line 372
    .line 373
    move-object v15, v12

    .line 374
    goto :goto_f

    .line 375
    :cond_d
    invoke-interface {v1, v2}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    move-object v15, v0

    .line 380
    :goto_f
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_e

    .line 385
    .line 386
    move-object/from16 v16, v12

    .line 387
    .line 388
    goto :goto_10

    .line 389
    :cond_e
    invoke-interface {v1, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    move-object/from16 v16, v0

    .line 394
    .line 395
    :goto_10
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_f

    .line 400
    .line 401
    move-object/from16 v17, v12

    .line 402
    .line 403
    goto :goto_11

    .line 404
    :cond_f
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    move-object/from16 v17, v0

    .line 409
    .line 410
    :goto_11
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_10

    .line 415
    .line 416
    :goto_12
    move-object/from16 v18, v12

    .line 417
    .line 418
    goto :goto_13

    .line 419
    :cond_10
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    goto :goto_12

    .line 424
    :goto_13
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 425
    .line 426
    .line 427
    move-result-wide v19

    .line 428
    new-instance v13, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 429
    .line 430
    invoke-direct/range {v13 .. v20}, Lcom/eddyizm/tempus/model/LyricsCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 431
    .line 432
    .line 433
    move-object v12, v13

    .line 434
    :cond_11
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 435
    .line 436
    .line 437
    return-object v12

    .line 438
    :goto_14
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 439
    .line 440
    .line 441
    throw v0

    .line 442
    :pswitch_a
    move-object/from16 v0, p1

    .line 443
    .line 444
    check-cast v0, Ldefpackage/x34;

    .line 445
    .line 446
    const-string v1, "DELETE FROM internet_radio_station_cache WHERE id = ?"

    .line 447
    .line 448
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    if-nez v13, :cond_12

    .line 453
    .line 454
    :try_start_4
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 455
    .line 456
    .line 457
    goto :goto_15

    .line 458
    :catchall_4
    move-exception v0

    .line 459
    goto :goto_16

    .line 460
    :cond_12
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 461
    .line 462
    .line 463
    :goto_15
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 464
    .line 465
    .line 466
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 467
    .line 468
    .line 469
    return-object v12

    .line 470
    :goto_16
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    :pswitch_b
    move-object/from16 v0, p1

    .line 475
    .line 476
    check-cast v0, Ldefpackage/x34;

    .line 477
    .line 478
    const-string v1, "SELECT * FROM internet_radio_station_cache WHERE id = ? LIMIT 1"

    .line 479
    .line 480
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    if-nez v13, :cond_13

    .line 485
    .line 486
    :try_start_5
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 487
    .line 488
    .line 489
    goto :goto_17

    .line 490
    :catchall_5
    move-exception v0

    .line 491
    goto/16 :goto_1f

    .line 492
    .line 493
    :cond_13
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 494
    .line 495
    .line 496
    :goto_17
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    const-string v2, "name"

    .line 501
    .line 502
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    const-string v3, "stream_url"

    .line 507
    .line 508
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    const-string v4, "home_page_url"

    .line 513
    .line 514
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    const-string v5, "source"

    .line 519
    .line 520
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    const-string v6, "cover_art_url"

    .line 525
    .line 526
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    if-eqz v7, :cond_1a

    .line 535
    .line 536
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    if-eqz v7, :cond_14

    .line 541
    .line 542
    move-object v14, v12

    .line 543
    goto :goto_18

    .line 544
    :cond_14
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    move-object v14, v0

    .line 549
    :goto_18
    invoke-interface {v1, v2}, Ldefpackage/z34;->isNull(I)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_15

    .line 554
    .line 555
    move-object v15, v12

    .line 556
    goto :goto_19

    .line 557
    :cond_15
    invoke-interface {v1, v2}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    move-object v15, v0

    .line 562
    :goto_19
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    if-eqz v0, :cond_16

    .line 567
    .line 568
    move-object/from16 v16, v12

    .line 569
    .line 570
    goto :goto_1a

    .line 571
    :cond_16
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    move-object/from16 v16, v0

    .line 576
    .line 577
    :goto_1a
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-eqz v0, :cond_17

    .line 582
    .line 583
    move-object/from16 v17, v12

    .line 584
    .line 585
    goto :goto_1b

    .line 586
    :cond_17
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    move-object/from16 v17, v0

    .line 591
    .line 592
    :goto_1b
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    if-eqz v0, :cond_18

    .line 597
    .line 598
    move-object/from16 v18, v12

    .line 599
    .line 600
    goto :goto_1c

    .line 601
    :cond_18
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    move-object/from16 v18, v0

    .line 606
    .line 607
    :goto_1c
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eqz v0, :cond_19

    .line 612
    .line 613
    :goto_1d
    move-object/from16 v19, v12

    .line 614
    .line 615
    goto :goto_1e

    .line 616
    :cond_19
    invoke-interface {v1, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v12

    .line 620
    goto :goto_1d

    .line 621
    :goto_1e
    new-instance v13, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 622
    .line 623
    invoke-direct/range {v13 .. v19}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 624
    .line 625
    .line 626
    move-object v12, v13

    .line 627
    :cond_1a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 628
    .line 629
    .line 630
    return-object v12

    .line 631
    :goto_1f
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 632
    .line 633
    .line 634
    throw v0

    .line 635
    :pswitch_c
    move-object/from16 v0, p1

    .line 636
    .line 637
    check-cast v0, Ldefpackage/q94;

    .line 638
    .line 639
    sget-object v1, Ldefpackage/o94;->a:[Ldefpackage/c42;

    .line 640
    .line 641
    sget-object v1, Ldefpackage/n94;->a:Ldefpackage/p94;

    .line 642
    .line 643
    invoke-static {v13}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-interface {v0, v1, v2}, Ldefpackage/q94;->a(Ldefpackage/p94;Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    invoke-static {v0}, Ldefpackage/o94;->a(Ldefpackage/q94;)V

    .line 651
    .line 652
    .line 653
    return-object v8

    .line 654
    :pswitch_d
    move-object/from16 v0, p1

    .line 655
    .line 656
    check-cast v0, Ldefpackage/qr1;

    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 662
    .line 663
    sget-object v1, Ldefpackage/rr1;->f:Ldefpackage/rp4;

    .line 664
    .line 665
    invoke-virtual {v1}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    check-cast v1, Ldefpackage/o83;

    .line 670
    .line 671
    new-instance v2, Ldefpackage/nz3;

    .line 672
    .line 673
    invoke-direct {v2}, Ldefpackage/nz3;-><init>()V

    .line 674
    .line 675
    .line 676
    iget-object v3, v0, Ldefpackage/qr1;->a:Ljava/lang/String;

    .line 677
    .line 678
    const-string v4, "/api/auth/me"

    .line 679
    .line 680
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    invoke-virtual {v2, v3}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    const-string v3, "Cookie"

    .line 688
    .line 689
    iget-object v0, v0, Ldefpackage/qr1;->b:Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v2, v3, v0}, Ldefpackage/nz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    new-instance v0, Ldefpackage/oz3;

    .line 695
    .line 696
    invoke-direct {v0, v2}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    new-instance v2, Ldefpackage/bv3;

    .line 703
    .line 704
    invoke-direct {v2, v1, v0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    :try_start_6
    iget-boolean v0, v1, Ldefpackage/k14;->C:Z

    .line 712
    .line 713
    if-eqz v0, :cond_1b

    .line 714
    .line 715
    const-class v0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 716
    .line 717
    invoke-static {v1, v0}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMe;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 722
    .line 723
    invoke-virtual {v1}, Ldefpackage/k14;->close()V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMe;->getUsername()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    const/16 v1, 0xa

    .line 731
    .line 732
    invoke-static {v13, v1, v13}, Ldefpackage/qm4;->G0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    return-object v0

    .line 745
    :catchall_6
    move-exception v0

    .line 746
    move-object v2, v0

    .line 747
    goto :goto_20

    .line 748
    :cond_1b
    :try_start_7
    invoke-static {v1}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 753
    :goto_20
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 754
    :catchall_7
    move-exception v0

    .line 755
    invoke-static {v1, v2}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 756
    .line 757
    .line 758
    throw v0

    .line 759
    :pswitch_e
    move-object/from16 v0, p1

    .line 760
    .line 761
    check-cast v0, Ljava/lang/String;

    .line 762
    .line 763
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    const-string v1, "/api/listen"

    .line 767
    .line 768
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    new-instance v1, Ldefpackage/fr1;

    .line 773
    .line 774
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1, v12, v0}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0}, Ldefpackage/gr1;->g()Ldefpackage/fr1;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    const-string v1, "ref"

    .line 789
    .line 790
    invoke-virtual {v0, v1, v13}, Ldefpackage/fr1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    new-instance v1, Ldefpackage/nz3;

    .line 798
    .line 799
    invoke-direct {v1}, Ldefpackage/nz3;-><init>()V

    .line 800
    .line 801
    .line 802
    iput-object v0, v1, Ldefpackage/nz3;->a:Ldefpackage/gr1;

    .line 803
    .line 804
    new-instance v0, Ldefpackage/oz3;

    .line 805
    .line 806
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 807
    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_f
    move-object/from16 v0, p1

    .line 811
    .line 812
    check-cast v0, Ljava/lang/String;

    .line 813
    .line 814
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    const-string v1, "/api/library/track-source"

    .line 818
    .line 819
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    new-instance v1, Ldefpackage/fr1;

    .line 824
    .line 825
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v1, v12, v0}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-virtual {v0}, Ldefpackage/gr1;->g()Ldefpackage/fr1;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    const-string v1, "nd_song_id"

    .line 840
    .line 841
    invoke-virtual {v0, v1, v13}, Ldefpackage/fr1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v0}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    new-instance v1, Ldefpackage/nz3;

    .line 849
    .line 850
    invoke-direct {v1}, Ldefpackage/nz3;-><init>()V

    .line 851
    .line 852
    .line 853
    iput-object v0, v1, Ldefpackage/nz3;->a:Ldefpackage/gr1;

    .line 854
    .line 855
    new-instance v0, Ldefpackage/oz3;

    .line 856
    .line 857
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 858
    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_10
    move-object/from16 v0, p1

    .line 862
    .line 863
    check-cast v0, Ldefpackage/x34;

    .line 864
    .line 865
    const-string v1, "UPDATE download SET download_state = 1 WHERE id = ?"

    .line 866
    .line 867
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    if-nez v13, :cond_1c

    .line 872
    .line 873
    :try_start_9
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 874
    .line 875
    .line 876
    goto :goto_21

    .line 877
    :catchall_8
    move-exception v0

    .line 878
    goto :goto_22

    .line 879
    :cond_1c
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 880
    .line 881
    .line 882
    :goto_21
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 883
    .line 884
    .line 885
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 886
    .line 887
    .line 888
    return-object v12

    .line 889
    :goto_22
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 890
    .line 891
    .line 892
    throw v0

    .line 893
    :pswitch_11
    move-object/from16 v0, p1

    .line 894
    .line 895
    check-cast v0, Ldefpackage/x34;

    .line 896
    .line 897
    const-string v1, "DELETE FROM download WHERE id = ?"

    .line 898
    .line 899
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    if-nez v13, :cond_1d

    .line 904
    .line 905
    :try_start_a
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 906
    .line 907
    .line 908
    goto :goto_23

    .line 909
    :catchall_9
    move-exception v0

    .line 910
    goto :goto_24

    .line 911
    :cond_1d
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 912
    .line 913
    .line 914
    :goto_23
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 915
    .line 916
    .line 917
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 918
    .line 919
    .line 920
    return-object v12

    .line 921
    :goto_24
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 922
    .line 923
    .line 924
    throw v0

    .line 925
    :pswitch_12
    move-object/from16 v0, p1

    .line 926
    .line 927
    check-cast v0, Ldefpackage/x34;

    .line 928
    .line 929
    const-string v1, "SELECT * FROM download WHERE id = ?"

    .line 930
    .line 931
    invoke-interface {v0, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    if-nez v13, :cond_1e

    .line 936
    .line 937
    :try_start_b
    invoke-interface {v1, v11}, Ldefpackage/z34;->e(I)V

    .line 938
    .line 939
    .line 940
    goto :goto_25

    .line 941
    :catchall_a
    move-exception v0

    .line 942
    goto/16 :goto_54

    .line 943
    .line 944
    :cond_1e
    invoke-interface {v1, v11, v13}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 945
    .line 946
    .line 947
    :goto_25
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    const-string v2, "playlist_id"

    .line 952
    .line 953
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    const-string v3, "playlist_name"

    .line 958
    .line 959
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 960
    .line 961
    .line 962
    move-result v3

    .line 963
    const-string v4, "download_state"

    .line 964
    .line 965
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 966
    .line 967
    .line 968
    move-result v4

    .line 969
    const-string v5, "download_uri"

    .line 970
    .line 971
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 972
    .line 973
    .line 974
    move-result v5

    .line 975
    const-string v6, "parent_id"

    .line 976
    .line 977
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 978
    .line 979
    .line 980
    move-result v6

    .line 981
    const-string v7, "is_dir"

    .line 982
    .line 983
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 984
    .line 985
    .line 986
    move-result v7

    .line 987
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 988
    .line 989
    .line 990
    move-result v8

    .line 991
    const-string v9, "album"

    .line 992
    .line 993
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 994
    .line 995
    .line 996
    move-result v9

    .line 997
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 998
    .line 999
    .line 1000
    move-result v10

    .line 1001
    const-string v13, "track"

    .line 1002
    .line 1003
    invoke-static {v1, v13}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1004
    .line 1005
    .line 1006
    move-result v13

    .line 1007
    const-string v14, "year"

    .line 1008
    .line 1009
    invoke-static {v1, v14}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1010
    .line 1011
    .line 1012
    move-result v14

    .line 1013
    const-string v15, "genre"

    .line 1014
    .line 1015
    invoke-static {v1, v15}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1016
    .line 1017
    .line 1018
    move-result v15

    .line 1019
    const-string v11, "cover_art_id"

    .line 1020
    .line 1021
    invoke-static {v1, v11}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1022
    .line 1023
    .line 1024
    move-result v11

    .line 1025
    const-string v12, "size"

    .line 1026
    .line 1027
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1028
    .line 1029
    .line 1030
    move-result v12

    .line 1031
    move/from16 p0, v12

    .line 1032
    .line 1033
    const-string v12, "content_type"

    .line 1034
    .line 1035
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1036
    .line 1037
    .line 1038
    move-result v12

    .line 1039
    move/from16 p1, v12

    .line 1040
    .line 1041
    const-string v12, "suffix"

    .line 1042
    .line 1043
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1044
    .line 1045
    .line 1046
    move-result v12

    .line 1047
    move/from16 v18, v12

    .line 1048
    .line 1049
    const-string v12, "transcoding_content_type"

    .line 1050
    .line 1051
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v12

    .line 1055
    move/from16 v19, v12

    .line 1056
    .line 1057
    const-string v12, "transcoded_suffix"

    .line 1058
    .line 1059
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v12

    .line 1063
    move/from16 v20, v12

    .line 1064
    .line 1065
    const-string v12, "duration"

    .line 1066
    .line 1067
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1068
    .line 1069
    .line 1070
    move-result v12

    .line 1071
    move/from16 v21, v12

    .line 1072
    .line 1073
    const-string v12, "bitrate"

    .line 1074
    .line 1075
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1076
    .line 1077
    .line 1078
    move-result v12

    .line 1079
    move/from16 v22, v12

    .line 1080
    .line 1081
    const-string v12, "sampling_rate"

    .line 1082
    .line 1083
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1084
    .line 1085
    .line 1086
    move-result v12

    .line 1087
    move/from16 v23, v12

    .line 1088
    .line 1089
    const-string v12, "bit_depth"

    .line 1090
    .line 1091
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1092
    .line 1093
    .line 1094
    move-result v12

    .line 1095
    move/from16 v24, v12

    .line 1096
    .line 1097
    const-string v12, "path"

    .line 1098
    .line 1099
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1100
    .line 1101
    .line 1102
    move-result v12

    .line 1103
    move/from16 v25, v12

    .line 1104
    .line 1105
    const-string v12, "is_video"

    .line 1106
    .line 1107
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1108
    .line 1109
    .line 1110
    move-result v12

    .line 1111
    move/from16 v26, v12

    .line 1112
    .line 1113
    const-string v12, "user_rating"

    .line 1114
    .line 1115
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1116
    .line 1117
    .line 1118
    move-result v12

    .line 1119
    move/from16 v27, v12

    .line 1120
    .line 1121
    const-string v12, "average_rating"

    .line 1122
    .line 1123
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1124
    .line 1125
    .line 1126
    move-result v12

    .line 1127
    move/from16 v28, v12

    .line 1128
    .line 1129
    const-string v12, "play_count"

    .line 1130
    .line 1131
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1132
    .line 1133
    .line 1134
    move-result v12

    .line 1135
    move/from16 v29, v12

    .line 1136
    .line 1137
    const-string v12, "disc_number"

    .line 1138
    .line 1139
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1140
    .line 1141
    .line 1142
    move-result v12

    .line 1143
    move/from16 v30, v12

    .line 1144
    .line 1145
    const-string v12, "created"

    .line 1146
    .line 1147
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1148
    .line 1149
    .line 1150
    move-result v12

    .line 1151
    move/from16 v31, v12

    .line 1152
    .line 1153
    const-string v12, "starred"

    .line 1154
    .line 1155
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1156
    .line 1157
    .line 1158
    move-result v12

    .line 1159
    move/from16 v32, v12

    .line 1160
    .line 1161
    const-string v12, "album_id"

    .line 1162
    .line 1163
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1164
    .line 1165
    .line 1166
    move-result v12

    .line 1167
    move/from16 v33, v12

    .line 1168
    .line 1169
    const-string v12, "artist_id"

    .line 1170
    .line 1171
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1172
    .line 1173
    .line 1174
    move-result v12

    .line 1175
    move/from16 v34, v12

    .line 1176
    .line 1177
    const-string v12, "type"

    .line 1178
    .line 1179
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1180
    .line 1181
    .line 1182
    move-result v12

    .line 1183
    move/from16 v35, v12

    .line 1184
    .line 1185
    const-string v12, "bookmark_position"

    .line 1186
    .line 1187
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1188
    .line 1189
    .line 1190
    move-result v12

    .line 1191
    move/from16 v36, v12

    .line 1192
    .line 1193
    const-string v12, "original_width"

    .line 1194
    .line 1195
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1196
    .line 1197
    .line 1198
    move-result v12

    .line 1199
    move/from16 v37, v12

    .line 1200
    .line 1201
    const-string v12, "original_height"

    .line 1202
    .line 1203
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1204
    .line 1205
    .line 1206
    move-result v12

    .line 1207
    move/from16 v38, v12

    .line 1208
    .line 1209
    const-string v12, "album_artist"

    .line 1210
    .line 1211
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1212
    .line 1213
    .line 1214
    move-result v12

    .line 1215
    move/from16 v39, v12

    .line 1216
    .line 1217
    const-string v12, "rg_track_gain"

    .line 1218
    .line 1219
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1220
    .line 1221
    .line 1222
    move-result v12

    .line 1223
    move/from16 v40, v11

    .line 1224
    .line 1225
    const-string v11, "rg_album_gain"

    .line 1226
    .line 1227
    invoke-static {v1, v11}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1228
    .line 1229
    .line 1230
    move-result v11

    .line 1231
    move/from16 v41, v15

    .line 1232
    .line 1233
    const-string v15, "rg_track_peak"

    .line 1234
    .line 1235
    invoke-static {v1, v15}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1236
    .line 1237
    .line 1238
    move-result v15

    .line 1239
    move/from16 v42, v14

    .line 1240
    .line 1241
    const-string v14, "rg_album_peak"

    .line 1242
    .line 1243
    invoke-static {v1, v14}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1244
    .line 1245
    .line 1246
    move-result v14

    .line 1247
    move/from16 v43, v13

    .line 1248
    .line 1249
    const-string v13, "rg_base_gain"

    .line 1250
    .line 1251
    invoke-static {v1, v13}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1252
    .line 1253
    .line 1254
    move-result v13

    .line 1255
    move/from16 v44, v10

    .line 1256
    .line 1257
    const-string v10, "rg_fallback_gain"

    .line 1258
    .line 1259
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 1260
    .line 1261
    .line 1262
    move-result v10

    .line 1263
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 1264
    .line 1265
    .line 1266
    move-result v45

    .line 1267
    if-eqz v45, :cond_4c

    .line 1268
    .line 1269
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v45

    .line 1273
    if-eqz v45, :cond_1f

    .line 1274
    .line 1275
    const/16 v46, 0x0

    .line 1276
    .line 1277
    goto :goto_26

    .line 1278
    :cond_1f
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v0

    .line 1282
    move-object/from16 v46, v0

    .line 1283
    .line 1284
    :goto_26
    invoke-interface {v1, v2}, Ldefpackage/z34;->isNull(I)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v0

    .line 1288
    if-eqz v0, :cond_20

    .line 1289
    .line 1290
    const/16 v47, 0x0

    .line 1291
    .line 1292
    goto :goto_27

    .line 1293
    :cond_20
    invoke-interface {v1, v2}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    move-object/from16 v47, v0

    .line 1298
    .line 1299
    :goto_27
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v0

    .line 1303
    if-eqz v0, :cond_21

    .line 1304
    .line 1305
    const/16 v48, 0x0

    .line 1306
    .line 1307
    goto :goto_28

    .line 1308
    :cond_21
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    move-object/from16 v48, v0

    .line 1313
    .line 1314
    :goto_28
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 1315
    .line 1316
    .line 1317
    move-result-wide v2

    .line 1318
    long-to-int v0, v2

    .line 1319
    invoke-interface {v1, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 1320
    .line 1321
    .line 1322
    move-result v2

    .line 1323
    if-eqz v2, :cond_22

    .line 1324
    .line 1325
    const/16 v50, 0x0

    .line 1326
    .line 1327
    goto :goto_29

    .line 1328
    :cond_22
    invoke-interface {v1, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    move-object/from16 v50, v2

    .line 1333
    .line 1334
    :goto_29
    invoke-interface {v1, v12}, Ldefpackage/z34;->isNull(I)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v2

    .line 1338
    if-eqz v2, :cond_24

    .line 1339
    .line 1340
    invoke-interface {v1, v11}, Ldefpackage/z34;->isNull(I)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v2

    .line 1344
    if-eqz v2, :cond_24

    .line 1345
    .line 1346
    invoke-interface {v1, v15}, Ldefpackage/z34;->isNull(I)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v2

    .line 1350
    if-eqz v2, :cond_24

    .line 1351
    .line 1352
    invoke-interface {v1, v14}, Ldefpackage/z34;->isNull(I)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v2

    .line 1356
    if-eqz v2, :cond_24

    .line 1357
    .line 1358
    invoke-interface {v1, v13}, Ldefpackage/z34;->isNull(I)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v2

    .line 1362
    if-eqz v2, :cond_24

    .line 1363
    .line 1364
    invoke-interface {v1, v10}, Ldefpackage/z34;->isNull(I)Z

    .line 1365
    .line 1366
    .line 1367
    move-result v2

    .line 1368
    if-nez v2, :cond_23

    .line 1369
    .line 1370
    goto :goto_2a

    .line 1371
    :cond_23
    const/4 v2, 0x0

    .line 1372
    goto/16 :goto_31

    .line 1373
    .line 1374
    :cond_24
    :goto_2a
    invoke-interface {v1, v12}, Ldefpackage/z34;->isNull(I)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v2

    .line 1378
    if-eqz v2, :cond_25

    .line 1379
    .line 1380
    const/16 v52, 0x0

    .line 1381
    .line 1382
    goto :goto_2b

    .line 1383
    :cond_25
    invoke-interface {v1, v12}, Ldefpackage/z34;->getDouble(I)D

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v2

    .line 1387
    double-to-float v2, v2

    .line 1388
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2

    .line 1392
    move-object/from16 v52, v2

    .line 1393
    .line 1394
    :goto_2b
    invoke-interface {v1, v11}, Ldefpackage/z34;->isNull(I)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v2

    .line 1398
    if-eqz v2, :cond_26

    .line 1399
    .line 1400
    const/16 v53, 0x0

    .line 1401
    .line 1402
    goto :goto_2c

    .line 1403
    :cond_26
    invoke-interface {v1, v11}, Ldefpackage/z34;->getDouble(I)D

    .line 1404
    .line 1405
    .line 1406
    move-result-wide v2

    .line 1407
    double-to-float v2, v2

    .line 1408
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v2

    .line 1412
    move-object/from16 v53, v2

    .line 1413
    .line 1414
    :goto_2c
    invoke-interface {v1, v15}, Ldefpackage/z34;->isNull(I)Z

    .line 1415
    .line 1416
    .line 1417
    move-result v2

    .line 1418
    if-eqz v2, :cond_27

    .line 1419
    .line 1420
    const/16 v54, 0x0

    .line 1421
    .line 1422
    goto :goto_2d

    .line 1423
    :cond_27
    invoke-interface {v1, v15}, Ldefpackage/z34;->getDouble(I)D

    .line 1424
    .line 1425
    .line 1426
    move-result-wide v2

    .line 1427
    double-to-float v2, v2

    .line 1428
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v2

    .line 1432
    move-object/from16 v54, v2

    .line 1433
    .line 1434
    :goto_2d
    invoke-interface {v1, v14}, Ldefpackage/z34;->isNull(I)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v2

    .line 1438
    if-eqz v2, :cond_28

    .line 1439
    .line 1440
    const/16 v55, 0x0

    .line 1441
    .line 1442
    goto :goto_2e

    .line 1443
    :cond_28
    invoke-interface {v1, v14}, Ldefpackage/z34;->getDouble(I)D

    .line 1444
    .line 1445
    .line 1446
    move-result-wide v2

    .line 1447
    double-to-float v2, v2

    .line 1448
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    move-object/from16 v55, v2

    .line 1453
    .line 1454
    :goto_2e
    invoke-interface {v1, v13}, Ldefpackage/z34;->isNull(I)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v2

    .line 1458
    if-eqz v2, :cond_29

    .line 1459
    .line 1460
    const/16 v56, 0x0

    .line 1461
    .line 1462
    goto :goto_2f

    .line 1463
    :cond_29
    invoke-interface {v1, v13}, Ldefpackage/z34;->getDouble(I)D

    .line 1464
    .line 1465
    .line 1466
    move-result-wide v2

    .line 1467
    double-to-float v2, v2

    .line 1468
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v2

    .line 1472
    move-object/from16 v56, v2

    .line 1473
    .line 1474
    :goto_2f
    invoke-interface {v1, v10}, Ldefpackage/z34;->isNull(I)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v2

    .line 1478
    if-eqz v2, :cond_2a

    .line 1479
    .line 1480
    const/16 v57, 0x0

    .line 1481
    .line 1482
    goto :goto_30

    .line 1483
    :cond_2a
    invoke-interface {v1, v10}, Ldefpackage/z34;->getDouble(I)D

    .line 1484
    .line 1485
    .line 1486
    move-result-wide v2

    .line 1487
    double-to-float v2, v2

    .line 1488
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    move-object/from16 v57, v2

    .line 1493
    .line 1494
    :goto_30
    new-instance v51, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 1495
    .line 1496
    invoke-direct/range {v51 .. v57}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 1497
    .line 1498
    .line 1499
    move-object/from16 v2, v51

    .line 1500
    .line 1501
    :goto_31
    new-instance v45, Lcom/eddyizm/tempus/model/Download;

    .line 1502
    .line 1503
    move/from16 v49, v0

    .line 1504
    .line 1505
    invoke-direct/range {v45 .. v50}, Lcom/eddyizm/tempus/model/Download;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 1506
    .line 1507
    .line 1508
    move-object/from16 v0, v45

    .line 1509
    .line 1510
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v3

    .line 1514
    if-eqz v3, :cond_2b

    .line 1515
    .line 1516
    const/4 v3, 0x0

    .line 1517
    goto :goto_32

    .line 1518
    :cond_2b
    invoke-interface {v1, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v3

    .line 1522
    :goto_32
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 1523
    .line 1524
    .line 1525
    invoke-interface {v1, v7}, Ldefpackage/z34;->getLong(I)J

    .line 1526
    .line 1527
    .line 1528
    move-result-wide v3

    .line 1529
    long-to-int v3, v3

    .line 1530
    const/4 v4, 0x0

    .line 1531
    if-eqz v3, :cond_2c

    .line 1532
    .line 1533
    const/4 v3, 0x1

    .line 1534
    goto :goto_33

    .line 1535
    :cond_2c
    move v3, v4

    .line 1536
    :goto_33
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 1537
    .line 1538
    .line 1539
    invoke-interface {v1, v8}, Ldefpackage/z34;->isNull(I)Z

    .line 1540
    .line 1541
    .line 1542
    move-result v3

    .line 1543
    if-eqz v3, :cond_2d

    .line 1544
    .line 1545
    const/4 v3, 0x0

    .line 1546
    goto :goto_34

    .line 1547
    :cond_2d
    invoke-interface {v1, v8}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v3

    .line 1551
    :goto_34
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 1552
    .line 1553
    .line 1554
    invoke-interface {v1, v9}, Ldefpackage/z34;->isNull(I)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v3

    .line 1558
    if-eqz v3, :cond_2e

    .line 1559
    .line 1560
    const/4 v3, 0x0

    .line 1561
    goto :goto_35

    .line 1562
    :cond_2e
    invoke-interface {v1, v9}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v3

    .line 1566
    :goto_35
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 1567
    .line 1568
    .line 1569
    move/from16 v3, v44

    .line 1570
    .line 1571
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1572
    .line 1573
    .line 1574
    move-result v5

    .line 1575
    if-eqz v5, :cond_2f

    .line 1576
    .line 1577
    const/4 v3, 0x0

    .line 1578
    goto :goto_36

    .line 1579
    :cond_2f
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v3

    .line 1583
    :goto_36
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 1584
    .line 1585
    .line 1586
    move/from16 v3, v43

    .line 1587
    .line 1588
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v5

    .line 1592
    if-eqz v5, :cond_30

    .line 1593
    .line 1594
    const/4 v3, 0x0

    .line 1595
    goto :goto_37

    .line 1596
    :cond_30
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1597
    .line 1598
    .line 1599
    move-result-wide v5

    .line 1600
    long-to-int v3, v5

    .line 1601
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v3

    .line 1605
    :goto_37
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 1606
    .line 1607
    .line 1608
    move/from16 v3, v42

    .line 1609
    .line 1610
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v5

    .line 1614
    if-eqz v5, :cond_31

    .line 1615
    .line 1616
    const/4 v3, 0x0

    .line 1617
    goto :goto_38

    .line 1618
    :cond_31
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1619
    .line 1620
    .line 1621
    move-result-wide v5

    .line 1622
    long-to-int v3, v5

    .line 1623
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v3

    .line 1627
    :goto_38
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 1628
    .line 1629
    .line 1630
    move/from16 v3, v41

    .line 1631
    .line 1632
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1633
    .line 1634
    .line 1635
    move-result v5

    .line 1636
    if-eqz v5, :cond_32

    .line 1637
    .line 1638
    const/4 v3, 0x0

    .line 1639
    goto :goto_39

    .line 1640
    :cond_32
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v3

    .line 1644
    :goto_39
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 1645
    .line 1646
    .line 1647
    move/from16 v3, v40

    .line 1648
    .line 1649
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v5

    .line 1653
    if-eqz v5, :cond_33

    .line 1654
    .line 1655
    const/4 v3, 0x0

    .line 1656
    goto :goto_3a

    .line 1657
    :cond_33
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v3

    .line 1661
    :goto_3a
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    move/from16 v3, p0

    .line 1665
    .line 1666
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1667
    .line 1668
    .line 1669
    move-result v5

    .line 1670
    if-eqz v5, :cond_34

    .line 1671
    .line 1672
    const/4 v3, 0x0

    .line 1673
    goto :goto_3b

    .line 1674
    :cond_34
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1675
    .line 1676
    .line 1677
    move-result-wide v5

    .line 1678
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v3

    .line 1682
    :goto_3b
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 1683
    .line 1684
    .line 1685
    move/from16 v3, p1

    .line 1686
    .line 1687
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1688
    .line 1689
    .line 1690
    move-result v5

    .line 1691
    if-eqz v5, :cond_35

    .line 1692
    .line 1693
    const/4 v3, 0x0

    .line 1694
    goto :goto_3c

    .line 1695
    :cond_35
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v3

    .line 1699
    :goto_3c
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 1700
    .line 1701
    .line 1702
    move/from16 v3, v18

    .line 1703
    .line 1704
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v5

    .line 1708
    if-eqz v5, :cond_36

    .line 1709
    .line 1710
    const/4 v3, 0x0

    .line 1711
    goto :goto_3d

    .line 1712
    :cond_36
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v3

    .line 1716
    :goto_3d
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 1717
    .line 1718
    .line 1719
    move/from16 v3, v19

    .line 1720
    .line 1721
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1722
    .line 1723
    .line 1724
    move-result v5

    .line 1725
    if-eqz v5, :cond_37

    .line 1726
    .line 1727
    const/4 v3, 0x0

    .line 1728
    goto :goto_3e

    .line 1729
    :cond_37
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v3

    .line 1733
    :goto_3e
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 1734
    .line 1735
    .line 1736
    move/from16 v3, v20

    .line 1737
    .line 1738
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1739
    .line 1740
    .line 1741
    move-result v5

    .line 1742
    if-eqz v5, :cond_38

    .line 1743
    .line 1744
    const/4 v3, 0x0

    .line 1745
    goto :goto_3f

    .line 1746
    :cond_38
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v3

    .line 1750
    :goto_3f
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 1751
    .line 1752
    .line 1753
    move/from16 v3, v21

    .line 1754
    .line 1755
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1756
    .line 1757
    .line 1758
    move-result v5

    .line 1759
    if-eqz v5, :cond_39

    .line 1760
    .line 1761
    const/4 v3, 0x0

    .line 1762
    goto :goto_40

    .line 1763
    :cond_39
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1764
    .line 1765
    .line 1766
    move-result-wide v5

    .line 1767
    long-to-int v3, v5

    .line 1768
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v3

    .line 1772
    :goto_40
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 1773
    .line 1774
    .line 1775
    move/from16 v3, v22

    .line 1776
    .line 1777
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v5

    .line 1781
    if-eqz v5, :cond_3a

    .line 1782
    .line 1783
    const/4 v3, 0x0

    .line 1784
    goto :goto_41

    .line 1785
    :cond_3a
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1786
    .line 1787
    .line 1788
    move-result-wide v5

    .line 1789
    long-to-int v3, v5

    .line 1790
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v3

    .line 1794
    :goto_41
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 1795
    .line 1796
    .line 1797
    move/from16 v3, v23

    .line 1798
    .line 1799
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1800
    .line 1801
    .line 1802
    move-result v5

    .line 1803
    if-eqz v5, :cond_3b

    .line 1804
    .line 1805
    const/4 v3, 0x0

    .line 1806
    goto :goto_42

    .line 1807
    :cond_3b
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1808
    .line 1809
    .line 1810
    move-result-wide v5

    .line 1811
    long-to-int v3, v5

    .line 1812
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v3

    .line 1816
    :goto_42
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 1817
    .line 1818
    .line 1819
    move/from16 v3, v24

    .line 1820
    .line 1821
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1822
    .line 1823
    .line 1824
    move-result v5

    .line 1825
    if-eqz v5, :cond_3c

    .line 1826
    .line 1827
    const/4 v3, 0x0

    .line 1828
    goto :goto_43

    .line 1829
    :cond_3c
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1830
    .line 1831
    .line 1832
    move-result-wide v5

    .line 1833
    long-to-int v3, v5

    .line 1834
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v3

    .line 1838
    :goto_43
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 1839
    .line 1840
    .line 1841
    move/from16 v3, v25

    .line 1842
    .line 1843
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1844
    .line 1845
    .line 1846
    move-result v5

    .line 1847
    if-eqz v5, :cond_3d

    .line 1848
    .line 1849
    const/4 v3, 0x0

    .line 1850
    goto :goto_44

    .line 1851
    :cond_3d
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v3

    .line 1855
    :goto_44
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 1856
    .line 1857
    .line 1858
    move/from16 v3, v26

    .line 1859
    .line 1860
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1861
    .line 1862
    .line 1863
    move-result-wide v5

    .line 1864
    long-to-int v3, v5

    .line 1865
    if-eqz v3, :cond_3e

    .line 1866
    .line 1867
    const/4 v11, 0x1

    .line 1868
    goto :goto_45

    .line 1869
    :cond_3e
    move v11, v4

    .line 1870
    :goto_45
    invoke-virtual {v0, v11}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 1871
    .line 1872
    .line 1873
    move/from16 v3, v27

    .line 1874
    .line 1875
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1876
    .line 1877
    .line 1878
    move-result v4

    .line 1879
    if-eqz v4, :cond_3f

    .line 1880
    .line 1881
    const/4 v3, 0x0

    .line 1882
    goto :goto_46

    .line 1883
    :cond_3f
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1884
    .line 1885
    .line 1886
    move-result-wide v3

    .line 1887
    long-to-int v3, v3

    .line 1888
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v3

    .line 1892
    :goto_46
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 1893
    .line 1894
    .line 1895
    move/from16 v3, v28

    .line 1896
    .line 1897
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1898
    .line 1899
    .line 1900
    move-result v4

    .line 1901
    if-eqz v4, :cond_40

    .line 1902
    .line 1903
    const/4 v3, 0x0

    .line 1904
    goto :goto_47

    .line 1905
    :cond_40
    invoke-interface {v1, v3}, Ldefpackage/z34;->getDouble(I)D

    .line 1906
    .line 1907
    .line 1908
    move-result-wide v3

    .line 1909
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v3

    .line 1913
    :goto_47
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 1914
    .line 1915
    .line 1916
    move/from16 v3, v29

    .line 1917
    .line 1918
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1919
    .line 1920
    .line 1921
    move-result v4

    .line 1922
    if-eqz v4, :cond_41

    .line 1923
    .line 1924
    const/4 v3, 0x0

    .line 1925
    goto :goto_48

    .line 1926
    :cond_41
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1927
    .line 1928
    .line 1929
    move-result-wide v3

    .line 1930
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v3

    .line 1934
    :goto_48
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 1935
    .line 1936
    .line 1937
    move/from16 v3, v30

    .line 1938
    .line 1939
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v4

    .line 1943
    if-eqz v4, :cond_42

    .line 1944
    .line 1945
    const/4 v3, 0x0

    .line 1946
    goto :goto_49

    .line 1947
    :cond_42
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1948
    .line 1949
    .line 1950
    move-result-wide v3

    .line 1951
    long-to-int v3, v3

    .line 1952
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v3

    .line 1956
    :goto_49
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 1957
    .line 1958
    .line 1959
    move/from16 v3, v31

    .line 1960
    .line 1961
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1962
    .line 1963
    .line 1964
    move-result v4

    .line 1965
    if-eqz v4, :cond_43

    .line 1966
    .line 1967
    const/4 v3, 0x0

    .line 1968
    goto :goto_4a

    .line 1969
    :cond_43
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1970
    .line 1971
    .line 1972
    move-result-wide v3

    .line 1973
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v3

    .line 1977
    :goto_4a
    invoke-static {v3}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v3

    .line 1981
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 1982
    .line 1983
    .line 1984
    move/from16 v3, v32

    .line 1985
    .line 1986
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 1987
    .line 1988
    .line 1989
    move-result v4

    .line 1990
    if-eqz v4, :cond_44

    .line 1991
    .line 1992
    const/4 v3, 0x0

    .line 1993
    goto :goto_4b

    .line 1994
    :cond_44
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 1995
    .line 1996
    .line 1997
    move-result-wide v3

    .line 1998
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v3

    .line 2002
    :goto_4b
    invoke-static {v3}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v3

    .line 2006
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 2007
    .line 2008
    .line 2009
    move/from16 v3, v33

    .line 2010
    .line 2011
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v4

    .line 2015
    if-eqz v4, :cond_45

    .line 2016
    .line 2017
    const/4 v3, 0x0

    .line 2018
    goto :goto_4c

    .line 2019
    :cond_45
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v3

    .line 2023
    :goto_4c
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 2024
    .line 2025
    .line 2026
    move/from16 v3, v34

    .line 2027
    .line 2028
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2029
    .line 2030
    .line 2031
    move-result v4

    .line 2032
    if-eqz v4, :cond_46

    .line 2033
    .line 2034
    const/4 v3, 0x0

    .line 2035
    goto :goto_4d

    .line 2036
    :cond_46
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v3

    .line 2040
    :goto_4d
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 2041
    .line 2042
    .line 2043
    move/from16 v3, v35

    .line 2044
    .line 2045
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2046
    .line 2047
    .line 2048
    move-result v4

    .line 2049
    if-eqz v4, :cond_47

    .line 2050
    .line 2051
    const/4 v3, 0x0

    .line 2052
    goto :goto_4e

    .line 2053
    :cond_47
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v3

    .line 2057
    :goto_4e
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 2058
    .line 2059
    .line 2060
    move/from16 v3, v36

    .line 2061
    .line 2062
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2063
    .line 2064
    .line 2065
    move-result v4

    .line 2066
    if-eqz v4, :cond_48

    .line 2067
    .line 2068
    const/4 v3, 0x0

    .line 2069
    goto :goto_4f

    .line 2070
    :cond_48
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 2071
    .line 2072
    .line 2073
    move-result-wide v3

    .line 2074
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v3

    .line 2078
    :goto_4f
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 2079
    .line 2080
    .line 2081
    move/from16 v3, v37

    .line 2082
    .line 2083
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2084
    .line 2085
    .line 2086
    move-result v4

    .line 2087
    if-eqz v4, :cond_49

    .line 2088
    .line 2089
    const/4 v3, 0x0

    .line 2090
    goto :goto_50

    .line 2091
    :cond_49
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 2092
    .line 2093
    .line 2094
    move-result-wide v3

    .line 2095
    long-to-int v3, v3

    .line 2096
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v3

    .line 2100
    :goto_50
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 2101
    .line 2102
    .line 2103
    move/from16 v3, v38

    .line 2104
    .line 2105
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2106
    .line 2107
    .line 2108
    move-result v4

    .line 2109
    if-eqz v4, :cond_4a

    .line 2110
    .line 2111
    const/4 v3, 0x0

    .line 2112
    goto :goto_51

    .line 2113
    :cond_4a
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 2114
    .line 2115
    .line 2116
    move-result-wide v3

    .line 2117
    long-to-int v3, v3

    .line 2118
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v3

    .line 2122
    :goto_51
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 2123
    .line 2124
    .line 2125
    move/from16 v3, v39

    .line 2126
    .line 2127
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 2128
    .line 2129
    .line 2130
    move-result v4

    .line 2131
    if-eqz v4, :cond_4b

    .line 2132
    .line 2133
    const/4 v12, 0x0

    .line 2134
    goto :goto_52

    .line 2135
    :cond_4b
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v12

    .line 2139
    :goto_52
    invoke-virtual {v0, v12}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 2140
    .line 2141
    .line 2142
    invoke-virtual {v0, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 2143
    .line 2144
    .line 2145
    move-object v12, v0

    .line 2146
    goto :goto_53

    .line 2147
    :cond_4c
    const/4 v12, 0x0

    .line 2148
    :goto_53
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2149
    .line 2150
    .line 2151
    return-object v12

    .line 2152
    :goto_54
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2153
    .line 2154
    .line 2155
    throw v0

    .line 2156
    nop

    .line 2157
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
