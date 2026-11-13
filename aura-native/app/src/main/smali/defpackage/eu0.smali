.class public final Ldefpackage/eu0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:[B

.field public static d:Ljava/util/HashMap;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ldefpackage/bi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "\u0000homemusic:automatic"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ldefpackage/eu0;->c:[B

    .line 12
    .line 13
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ldefpackage/eu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/bi0;Ldefpackage/lt0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Ldefpackage/eu0;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/eu0;->b:Ldefpackage/bi0;

    .line 11
    .line 12
    new-instance p0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object p0, Ldefpackage/eu0;->d:Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object p0, p3, Ldefpackage/lt0;->b:Ldefpackage/fk0;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    :try_start_0
    new-array p1, p1, [I

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ldefpackage/fk0;->g([I)Ldefpackage/ek0;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    iget-object p1, p0, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 29
    .line 30
    :goto_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    add-int/lit8 p2, p2, 0x1

    .line 35
    .line 36
    invoke-interface {p1, p2}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-static {p1}, Ldefpackage/fk0;->e(Landroid/database/Cursor;)Ldefpackage/ns0;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    sget-object p3, Ldefpackage/eu0;->d:Ljava/util/HashMap;

    .line 47
    .line 48
    iget-object v0, p2, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 49
    .line 50
    iget-object v0, v0, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Ldefpackage/ek0;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Ldefpackage/ek0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 71
    :catch_0
    move-exception p0

    .line 72
    const-string p1, "DownloaderManager"

    .line 73
    .line 74
    const-string p2, "Failed to query downloads"

    .line 75
    .line 76
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/eu0;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/ns0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget p0, p0, Ldefpackage/ns0;->b:I

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/eu0;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/ns0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget p0, p0, Ldefpackage/ns0;->b:I

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static h(Ldefpackage/ns0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ldefpackage/qt0;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v1, v0, v3}, Ldefpackage/qt0;-><init>(Ldefpackage/ss0;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/lang/Thread;

    .line 20
    .line 21
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Ldefpackage/eu0;->d:Ljava/util/HashMap;

    .line 28
    .line 29
    iget-object v1, p0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 30
    .line 31
    iget-object v2, v1, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object p0, Ldefpackage/eu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 37
    .line 38
    iget-object v0, v1, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/List;Z)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ldefpackage/gn2;

    .line 14
    .line 15
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/eddyizm/tempus/model/Download;

    .line 20
    .line 21
    invoke-virtual {p0, v2, v3, p3}, Ldefpackage/eu0;->b(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v1
.end method

.method public final b(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;Z)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Ldefpackage/e03;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const-string v4, "audio_transcode_download"

    .line 14
    .line 15
    invoke-static {v4, v3}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_3

    .line 20
    .line 21
    const-string v4, "audio_transcode_download_priority"

    .line 22
    .line 23
    invoke-static {v4, v3}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {}, Ldefpackage/e03;->l()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {}, Ldefpackage/e03;->l()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v6, "raw"

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "0"

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const-string v7, "max_bitrate_download"

    .line 61
    .line 62
    invoke-interface {v5, v7, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-static {v2, v4, v6}, Ldefpackage/e03;->a(Lcom/eddyizm/tempus/model/Download;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    iget-object v4, v1, Ldefpackage/gn2;->f:Ldefpackage/cn2;

    .line 73
    .line 74
    iget-object v5, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, v4, Ldefpackage/cn2;->a:Landroid/net/Uri;

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v2, v4}, Lcom/eddyizm/tempus/model/Download;->setDownloadUri(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v6, Ldefpackage/pm0;

    .line 86
    .line 87
    iget-object v4, v0, Ldefpackage/eu0;->a:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-direct {v6, v7}, Ldefpackage/pm0;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    const/4 v12, 0x1

    .line 97
    iput v12, v6, Ldefpackage/pm0;->c:I

    .line 98
    .line 99
    sget-object v13, Ldefpackage/zs0;->c:Ldefpackage/jn0;

    .line 100
    .line 101
    iget-object v7, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v8, v7, Ldefpackage/bn2;->b:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v7, v7, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 109
    .line 110
    invoke-static {v7, v8}, Ldefpackage/f35;->J(Landroid/net/Uri;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    const/4 v10, 0x4

    .line 115
    if-ne v9, v10, :cond_4

    .line 116
    .line 117
    move v9, v12

    .line 118
    goto :goto_2

    .line 119
    :cond_4
    move v9, v3

    .line 120
    :goto_2
    iget-object v0, v0, Ldefpackage/eu0;->b:Ldefpackage/bi0;

    .line 121
    .line 122
    if-nez v9, :cond_6

    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    move v11, v3

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    :goto_3
    move v11, v12

    .line 130
    :goto_4
    invoke-static {v11}, Ldefpackage/rr2;->l(Z)V

    .line 131
    .line 132
    .line 133
    new-instance v14, Ldefpackage/zs0;

    .line 134
    .line 135
    const/16 v23, 0x0

    .line 136
    .line 137
    if-eqz v9, :cond_7

    .line 138
    .line 139
    if-nez v0, :cond_7

    .line 140
    .line 141
    move-object/from16 v0, v23

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    invoke-static {v7, v8}, Ldefpackage/f35;->J(Landroid/net/Uri;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-ne v7, v10, :cond_8

    .line 149
    .line 150
    new-instance v7, Ldefpackage/jr3;

    .line 151
    .line 152
    new-instance v8, Ldefpackage/sk0;

    .line 153
    .line 154
    invoke-direct {v8}, Ldefpackage/sk0;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-direct {v7, v0, v8}, Ldefpackage/jr3;-><init>(Ldefpackage/bi0;Ldefpackage/n51;)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_8
    new-instance v7, Ldefpackage/dm0;

    .line 162
    .line 163
    sget-object v8, Ldefpackage/n51;->a:Ldefpackage/q2;

    .line 164
    .line 165
    invoke-direct {v7, v0, v8}, Ldefpackage/dm0;-><init>(Ldefpackage/bi0;Ldefpackage/n51;)V

    .line 166
    .line 167
    .line 168
    :goto_5
    invoke-interface {v7, v1}, Ldefpackage/lt2;->d(Ldefpackage/gn2;)Ldefpackage/bq;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :goto_6
    invoke-static/range {v23 .. v23}, Ldefpackage/f35;->q(Ldefpackage/gt0;)Landroid/os/Handler;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    new-instance v8, Ldefpackage/i80;

    .line 177
    .line 178
    const/16 v9, 0x1d

    .line 179
    .line 180
    invoke-direct {v8, v9}, Ldefpackage/i80;-><init>(I)V

    .line 181
    .line 182
    .line 183
    new-instance v9, Ldefpackage/om0;

    .line 184
    .line 185
    invoke-direct {v9, v3}, Ldefpackage/om0;-><init>(I)V

    .line 186
    .line 187
    .line 188
    new-instance v10, Ldefpackage/mj0;

    .line 189
    .line 190
    const/4 v11, 0x6

    .line 191
    invoke-direct {v10, v11}, Ldefpackage/mj0;-><init>(I)V

    .line 192
    .line 193
    .line 194
    new-instance v11, Ldefpackage/mj0;

    .line 195
    .line 196
    const/4 v15, 0x7

    .line 197
    invoke-direct {v11, v15}, Ldefpackage/mj0;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v6 .. v11}, Ldefpackage/pm0;->b(Landroid/os/Handler;Ldefpackage/o55;Ldefpackage/qm;Ldefpackage/rs4;Ldefpackage/xv2;)[Ldefpackage/kq;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    array-length v7, v6

    .line 205
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, [Ldefpackage/kq;

    .line 210
    .line 211
    move v8, v3

    .line 212
    :goto_7
    array-length v9, v6

    .line 213
    if-ge v8, v9, :cond_9

    .line 214
    .line 215
    aget-object v9, v7, v8

    .line 216
    .line 217
    sget-object v10, Ldefpackage/ik3;->c:Ldefpackage/ik3;

    .line 218
    .line 219
    iput v8, v9, Ldefpackage/kq;->r:I

    .line 220
    .line 221
    iput-object v10, v9, Ldefpackage/kq;->s:Ldefpackage/ik3;

    .line 222
    .line 223
    sget-object v10, Ldefpackage/vp4;->a:Ldefpackage/vp4;

    .line 224
    .line 225
    iput-object v10, v9, Ldefpackage/kq;->t:Ldefpackage/vp4;

    .line 226
    .line 227
    add-int/lit8 v8, v8, 0x1

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_9
    invoke-direct {v14, v1, v0, v13}, Ldefpackage/zs0;-><init>(Ldefpackage/gn2;Ldefpackage/bq;Ldefpackage/cw4;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    if-eqz p3, :cond_a

    .line 237
    .line 238
    sget-object v0, Ldefpackage/eu0;->c:[B

    .line 239
    .line 240
    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, [B

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_a
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 248
    .line 249
    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :goto_8
    iget-object v6, v14, Ldefpackage/zs0;->a:Ldefpackage/bn2;

    .line 254
    .line 255
    iget-object v7, v6, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 256
    .line 257
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    iget-object v7, v6, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 261
    .line 262
    iget-object v8, v6, Ldefpackage/bn2;->b:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v8}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    iget-object v9, v6, Ldefpackage/bn2;->c:Ldefpackage/ym2;

    .line 269
    .line 270
    if-eqz v9, :cond_c

    .line 271
    .line 272
    iget-object v9, v9, Ldefpackage/ym2;->h:[B

    .line 273
    .line 274
    if-eqz v9, :cond_b

    .line 275
    .line 276
    array-length v10, v9

    .line 277
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    goto :goto_9

    .line 282
    :cond_b
    const/4 v9, 0x0

    .line 283
    goto :goto_9

    .line 284
    :cond_c
    move-object/from16 v9, v23

    .line 285
    .line 286
    :goto_9
    iget-object v6, v6, Ldefpackage/bn2;->f:Ljava/lang/String;

    .line 287
    .line 288
    const/4 v10, 0x2

    .line 289
    iget v11, v14, Ldefpackage/zs0;->b:I

    .line 290
    .line 291
    if-eq v11, v10, :cond_12

    .line 292
    .line 293
    sget-object v11, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 294
    .line 295
    sget-object v11, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 296
    .line 297
    invoke-static {v7, v8}, Ldefpackage/f35;->J(Landroid/net/Uri;Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    if-eqz v13, :cond_d

    .line 302
    .line 303
    if-eq v13, v10, :cond_d

    .line 304
    .line 305
    if-ne v13, v12, :cond_f

    .line 306
    .line 307
    :cond_d
    if-nez v6, :cond_e

    .line 308
    .line 309
    move v10, v12

    .line 310
    goto :goto_a

    .line 311
    :cond_e
    move v10, v3

    .line 312
    :goto_a
    const-string v14, "customCacheKey must be null for type: %s"

    .line 313
    .line 314
    invoke-static {v13, v14, v10}, Ldefpackage/rr2;->j(ILjava/lang/String;Z)V

    .line 315
    .line 316
    .line 317
    :cond_f
    new-instance v10, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v10}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v19

    .line 329
    if-eqz v9, :cond_10

    .line 330
    .line 331
    array-length v10, v9

    .line 332
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    move-object/from16 v20, v9

    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_10
    move-object/from16 v20, v23

    .line 340
    .line 341
    :goto_b
    if-eqz v0, :cond_11

    .line 342
    .line 343
    array-length v9, v0

    .line 344
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    :goto_c
    move-object/from16 v22, v0

    .line 349
    .line 350
    goto :goto_d

    .line 351
    :cond_11
    sget-object v0, Ldefpackage/f35;->b:[B

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :goto_d
    iget-object v0, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 355
    .line 356
    new-instance v15, Ldefpackage/tt0;

    .line 357
    .line 358
    move-object/from16 v24, v23

    .line 359
    .line 360
    move-object/from16 v16, v0

    .line 361
    .line 362
    move-object/from16 v21, v6

    .line 363
    .line 364
    move-object/from16 v17, v7

    .line 365
    .line 366
    move-object/from16 v18, v8

    .line 367
    .line 368
    invoke-direct/range {v15 .. v24}, Ldefpackage/tt0;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[BLdefpackage/rt0;Ldefpackage/st0;)V

    .line 369
    .line 370
    .line 371
    sget-object v1, Ldefpackage/eu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 372
    .line 373
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    :try_start_0
    const-string v0, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD"

    .line 377
    .line 378
    sget-object v6, Ldefpackage/vt0;->v:Ljava/util/HashMap;

    .line 379
    .line 380
    const-class v6, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 381
    .line 382
    new-instance v7, Landroid/content/Intent;

    .line 383
    .line 384
    invoke-direct {v7, v4, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    const-string v6, "foreground"

    .line 392
    .line 393
    invoke-virtual {v0, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    const-string v6, "download_request"

    .line 398
    .line 399
    invoke-virtual {v0, v6, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    const-string v6, "stop_reason"

    .line 404
    .line 405
    invoke-virtual {v0, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v4, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    .line 411
    .line 412
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    new-instance v1, Ldefpackage/lg1;

    .line 421
    .line 422
    const/16 v3, 0xb

    .line 423
    .line 424
    invoke-direct {v1, v3, v0, v2}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    new-instance v0, Ljava/lang/Thread;

    .line 428
    .line 429
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 433
    .line 434
    .line 435
    return v12

    .line 436
    :catch_0
    move-exception v0

    .line 437
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    const-string v1, "Download service not started for "

    .line 441
    .line 442
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    const-string v2, "DownloaderManager"

    .line 447
    .line 448
    invoke-static {v2, v1, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 449
    .line 450
    .line 451
    return v3

    .line 452
    :cond_12
    if-ne v11, v10, :cond_13

    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_13
    move v12, v3

    .line 456
    :goto_e
    invoke-static {v12}, Ldefpackage/rr2;->w(Z)V

    .line 457
    .line 458
    .line 459
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 460
    .line 461
    .line 462
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 463
    .line 464
    .line 465
    new-instance v0, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 468
    .line 469
    .line 470
    new-instance v0, Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 473
    .line 474
    .line 475
    throw v23
.end method

.method public final e(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;)V
    .locals 3

    .line 1
    iget-object p1, p1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Ldefpackage/vt0;->v:Ljava/util/HashMap;

    .line 4
    .line 5
    new-instance v0, Landroid/content/Intent;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/eu0;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-class v1, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "foreground"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "content_id"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Ldefpackage/qt0;

    .line 49
    .line 50
    invoke-direct {v0, p1, p0, v2}, Ldefpackage/qt0;-><init>(Ldefpackage/ss0;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    new-instance p0, Ljava/lang/Thread;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Ldefpackage/eu0;->d:Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final f(Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ldefpackage/gn2;

    .line 13
    .line 14
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/eddyizm/tempus/model/Download;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v2}, Ldefpackage/eu0;->e(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/eu0;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"

    .line 4
    .line 5
    sget-object v2, Ldefpackage/vt0;->v:Ljava/util/HashMap;

    .line 6
    .line 7
    const-class v2, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 8
    .line 9
    new-instance v3, Landroid/content/Intent;

    .line 10
    .line 11
    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "foreground"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ldefpackage/g5;

    .line 37
    .line 38
    const/4 v2, 0x7

    .line 39
    invoke-direct {v1, v2, v0}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Ljava/lang/Thread;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Ldefpackage/eu0;->a:Landroid/content/Context;

    .line 51
    .line 52
    const-class v0, Ldefpackage/au0;

    .line 53
    .line 54
    monitor-enter v0

    .line 55
    :try_start_0
    invoke-static {p0}, Ldefpackage/au0;->v(Landroid/content/Context;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v1}, Ldefpackage/au0;->K(Ljava/io/File;Ljava/util/ArrayList;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    :goto_0
    if-ge v3, p0, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    check-cast v2, Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_1

    .line 87
    :cond_0
    monitor-exit v0

    .line 88
    return-void

    .line 89
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    throw p0
.end method
