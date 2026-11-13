.class public abstract Ldefpackage/pt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/pt0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Ldefpackage/pn4;Ljava/lang/String;)Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/gp3;->m(Ljava/lang/String;)Lretrofit2/Call;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lretrofit2/Response;->isSuccessful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-string v1, "getSong for "

    .line 18
    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    invoke-virtual {p0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    invoke-virtual {p0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->FAILED:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/16 v3, 0x46

    .line 73
    .line 74
    if-ne v0, v3, :cond_0

    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 78
    .line 79
    const-string v2, " failed with "

    .line 80
    .line 81
    invoke-static {v1, p1, v2}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, " "

    .line 93
    .line 94
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Error;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_1
    const-string p0, " failed without an error code"

    .line 113
    .line 114
    invoke-static {v1, p1, p0}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_2
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSong()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-eqz p0, :cond_3

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_3
    const-string p0, " succeeded without a song"

    .line 130
    .line 131
    invoke-static {v1, p1, p0}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v2

    .line 139
    :cond_4
    const-string p0, " returned no subsonic response"

    .line 140
    .line 141
    invoke-static {v1, p1, p0}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v2

    .line 149
    :cond_5
    const-string p0, " returned an empty body"

    .line 150
    .line 151
    invoke-static {v1, p1, p0}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v2

    .line 159
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 160
    .line 161
    const-string v2, " returned HTTP "

    .line 162
    .line 163
    invoke-static {v1, p1, v2}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0}, Lretrofit2/Response;->code()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0
.end method

.method public static b(Landroid/content/Context;Ldefpackage/ss0;Ljava/util/ArrayList;)I
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    move v3, v1

    .line 19
    :goto_0
    const/4 v4, 0x1

    .line 20
    if-ge v3, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    check-cast v5, Lcom/eddyizm/tempus/model/Download;

    .line 29
    .line 30
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, p1, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Ldefpackage/s24;

    .line 37
    .line 38
    new-instance v8, Ldefpackage/rs0;

    .line 39
    .line 40
    invoke-direct {v8, p1, v6}, Ldefpackage/rs0;-><init>(Ldefpackage/ss0;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v7, v4, v1, v8}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lcom/eddyizm/tempus/model/Download;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {p0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v6}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    :goto_1
    return v1

    .line 84
    :cond_4
    iget-object p0, p1, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Ldefpackage/s24;

    .line 87
    .line 88
    new-instance p2, Ldefpackage/o;

    .line 89
    .line 90
    const/4 v2, 0x7

    .line 91
    invoke-direct {p2, v2, p1, v0}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v1, v4, p2}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0
.end method

.method public static c()Z
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/ud3;->y()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Ldefpackage/ud3;->J()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ldefpackage/ud3;->B()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
.end method

.method public static d(I)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "download_database_repaired_version"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "download_repair_attempts"

    .line 4
    .line 5
    const-string v3, " download rows"

    .line 6
    .line 7
    const-string v4, " of "

    .line 8
    .line 9
    const-string v5, "Restored "

    .line 10
    .line 11
    const-string v6, "Skipped "

    .line 12
    .line 13
    const-string v7, "DownloadRepair"

    .line 14
    .line 15
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ldefpackage/s24;->j()Ldefpackage/so4;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ldefpackage/so4;->w()Ldefpackage/we1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ldefpackage/we1;->u()I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v9, "download_database_repaired_version"

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-ne v0, v8, :cond_0

    .line 50
    .line 51
    goto/16 :goto_9

    .line 52
    .line 53
    :cond_0
    invoke-static {}, Ldefpackage/pt0;->c()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    goto/16 :goto_9

    .line 60
    .line 61
    :cond_1
    const-class v9, Ldefpackage/au0;

    .line 62
    .line 63
    monitor-enter v9

    .line 64
    :try_start_0
    invoke-static {v1}, Ldefpackage/au0;->m(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Ldefpackage/au0;->t:Ldefpackage/lt0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 68
    .line 69
    monitor-exit v9

    .line 70
    iget-object v0, v0, Ldefpackage/lt0;->b:Ldefpackage/fk0;

    .line 71
    .line 72
    new-instance v9, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    const/4 v11, 0x3

    .line 78
    const/4 v12, 0x1

    .line 79
    :try_start_1
    filled-new-array {v11}, [I

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    invoke-virtual {v0, v13}, Ldefpackage/fk0;->g([I)Ldefpackage/ek0;

    .line 84
    .line 85
    .line 86
    move-result-object v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    :goto_0
    :try_start_2
    iget-object v0, v13, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 88
    .line 89
    invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    add-int/2addr v14, v12

    .line 94
    invoke-interface {v0, v14}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    iget-object v0, v13, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 101
    .line 102
    invoke-static {v0}, Ldefpackage/fk0;->e(Landroid/database/Cursor;)Ldefpackage/ns0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v14, v0, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 107
    .line 108
    iget-wide v14, v14, Ldefpackage/mt0;->a:J

    .line 109
    .line 110
    const-wide/16 v16, 0x0

    .line 111
    .line 112
    cmp-long v14, v14, v16

    .line 113
    .line 114
    if-gtz v14, :cond_2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    iget-object v0, v0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 118
    .line 119
    new-instance v14, Ldefpackage/ot0;

    .line 120
    .line 121
    iget-object v15, v0, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v0, v0, Ldefpackage/tt0;->o:Landroid/net/Uri;

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {v14, v15, v0}, Ldefpackage/ot0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object v9, v0

    .line 138
    goto :goto_1

    .line 139
    :cond_3
    :try_start_3
    invoke-virtual {v13}, Ldefpackage/ek0;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :catch_0
    move-exception v0

    .line 144
    goto :goto_3

    .line 145
    :goto_1
    :try_start_4
    invoke-virtual {v13}, Ldefpackage/ek0;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    :try_start_5
    invoke-virtual {v9, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :goto_2
    throw v9
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 154
    :goto_3
    const-string v9, "Failed to read the download index"

    .line 155
    .line 156
    invoke-static {v7, v9, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 157
    .line 158
    .line 159
    const/4 v9, 0x0

    .line 160
    :goto_4
    if-nez v9, :cond_4

    .line 161
    .line 162
    goto/16 :goto_9

    .line 163
    .line 164
    :cond_4
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    new-instance v14, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    move v15, v10

    .line 182
    :goto_5
    if-ge v15, v0, :cond_6

    .line 183
    .line 184
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v16

    .line 188
    add-int/lit8 v15, v15, 0x1

    .line 189
    .line 190
    move-object/from16 v11, v16

    .line 191
    .line 192
    check-cast v11, Ldefpackage/ot0;

    .line 193
    .line 194
    iget-object v10, v11, Ldefpackage/ot0;->a:Ljava/lang/String;

    .line 195
    .line 196
    iget-object v12, v13, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v12, Ldefpackage/s24;

    .line 199
    .line 200
    move/from16 v19, v0

    .line 201
    .line 202
    new-instance v0, Ldefpackage/rs0;

    .line 203
    .line 204
    invoke-direct {v0, v13, v10}, Ldefpackage/rs0;-><init>(Ldefpackage/ss0;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    move/from16 v20, v8

    .line 208
    .line 209
    const/4 v8, 0x0

    .line 210
    const/4 v10, 0x1

    .line 211
    invoke-static {v12, v10, v8, v0}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Lcom/eddyizm/tempus/model/Download;

    .line 216
    .line 217
    if-nez v0, :cond_5

    .line 218
    .line 219
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    :cond_5
    move v10, v8

    .line 223
    move/from16 v0, v19

    .line 224
    .line 225
    move/from16 v8, v20

    .line 226
    .line 227
    const/4 v11, 0x3

    .line 228
    const/4 v12, 0x1

    .line 229
    goto :goto_5

    .line 230
    :cond_6
    move/from16 v20, v8

    .line 231
    .line 232
    move v8, v10

    .line 233
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_7

    .line 238
    .line 239
    invoke-static/range {v20 .. v20}, Ldefpackage/pt0;->d(I)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_7
    invoke-static {v8}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    new-instance v8, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    :try_start_6
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 253
    .line 254
    .line 255
    move-result v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 256
    const/4 v0, 0x0

    .line 257
    const/4 v11, 0x0

    .line 258
    const/4 v12, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    :goto_6
    if-ge v0, v10, :cond_d

    .line 261
    .line 262
    :try_start_7
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v19

    .line 266
    add-int/lit8 v21, v0, 0x1

    .line 267
    .line 268
    move/from16 v22, v10

    .line 269
    .line 270
    move-object/from16 v10, v19

    .line 271
    .line 272
    check-cast v10, Ldefpackage/ot0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 273
    .line 274
    :try_start_8
    iget-object v0, v10, Ldefpackage/ot0;->a:Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v9, v0}, Ldefpackage/pt0;->a(Ldefpackage/pn4;Ljava/lang/String;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 277
    .line 278
    .line 279
    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 280
    if-nez v0, :cond_8

    .line 281
    .line 282
    :try_start_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    iget-object v10, v10, Ldefpackage/ot0;->a:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v10, ": the server no longer has it"

    .line 296
    .line 297
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v7, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    move-object/from16 v19, v9

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :catchall_2
    move-exception v0

    .line 311
    move v10, v11

    .line 312
    goto/16 :goto_a

    .line 313
    .line 314
    :cond_8
    iget-object v12, v10, Ldefpackage/ot0;->a:Ljava/lang/String;

    .line 315
    .line 316
    move-object/from16 v19, v9

    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    if-nez v9, :cond_a

    .line 327
    .line 328
    new-instance v9, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    iget-object v10, v10, Ldefpackage/ot0;->a:Ljava/lang/String;

    .line 337
    .line 338
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v10, ": the server answered with id "

    .line 342
    .line 343
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v7, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    :cond_9
    :goto_7
    move-object/from16 v9, v19

    .line 361
    .line 362
    move/from16 v0, v21

    .line 363
    .line 364
    move/from16 v10, v22

    .line 365
    .line 366
    const/4 v12, 0x0

    .line 367
    goto :goto_6

    .line 368
    :cond_a
    new-instance v9, Lcom/eddyizm/tempus/model/Download;

    .line 369
    .line 370
    invoke-direct {v9, v0}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 371
    .line 372
    .line 373
    const/4 v12, 0x1

    .line 374
    invoke-virtual {v9, v12}, Lcom/eddyizm/tempus/model/Download;->setDownloadState(I)V

    .line 375
    .line 376
    .line 377
    iget-object v0, v10, Ldefpackage/ot0;->b:Ljava/lang/String;

    .line 378
    .line 379
    invoke-virtual {v9, v0}, Lcom/eddyizm/tempus/model/Download;->setDownloadUri(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v10, Ldefpackage/ot0;->b:Ljava/lang/String;

    .line 383
    .line 384
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Landroid/net/Uri;->isOpaque()Z

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    if-eqz v10, :cond_b

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_b
    const-string v10, "format"

    .line 396
    .line 397
    invoke-virtual {v0, v10}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    const-string v12, "maxBitRate"

    .line 402
    .line 403
    invoke-virtual {v0, v12}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v9, v10, v0}, Ldefpackage/e03;->a(Lcom/eddyizm/tempus/model/Download;Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    :goto_8
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    const/16 v9, 0x32

    .line 418
    .line 419
    if-lt v0, v9, :cond_9

    .line 420
    .line 421
    invoke-static {v1, v13, v8}, Ldefpackage/pt0;->b(Landroid/content/Context;Ldefpackage/ss0;Ljava/util/ArrayList;)I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    add-int/2addr v11, v0

    .line 426
    goto :goto_7

    .line 427
    :catch_1
    move-exception v0

    .line 428
    move-object/from16 v19, v9

    .line 429
    .line 430
    const/16 v18, 0x1

    .line 431
    .line 432
    add-int/lit8 v12, v12, 0x1

    .line 433
    .line 434
    const/4 v9, 0x3

    .line 435
    if-ge v12, v9, :cond_c

    .line 436
    .line 437
    new-instance v9, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    iget-object v10, v10, Ldefpackage/ot0;->a:Ljava/lang/String;

    .line 446
    .line 447
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    invoke-static {v7, v9, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 455
    .line 456
    .line 457
    move-object/from16 v9, v19

    .line 458
    .line 459
    move/from16 v0, v21

    .line 460
    .line 461
    move/from16 v10, v22

    .line 462
    .line 463
    const/4 v15, 0x1

    .line 464
    goto/16 :goto_6

    .line 465
    .line 466
    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    const-string v6, "Stopped the repair, "

    .line 472
    .line 473
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    const-string v6, " failures in a row"

    .line 480
    .line 481
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-static {v7, v2, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 489
    .line 490
    .line 491
    invoke-static {v1, v13, v8}, Ldefpackage/pt0;->b(Landroid/content/Context;Ldefpackage/ss0;Ljava/util/ArrayList;)I

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    add-int/2addr v0, v11

    .line 496
    invoke-static {v0, v5, v4}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-static {v7, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    return-void

    .line 518
    :cond_d
    invoke-static {v1, v13, v8}, Ldefpackage/pt0;->b(Landroid/content/Context;Ldefpackage/ss0;Ljava/util/ArrayList;)I

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    add-int/2addr v0, v11

    .line 523
    invoke-static {v0, v5, v4}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-static {v7, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 542
    .line 543
    .line 544
    if-eqz v15, :cond_e

    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_e
    if-lez v0, :cond_f

    .line 548
    .line 549
    invoke-static/range {v20 .. v20}, Ldefpackage/pt0;->d(I)V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :cond_f
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    const/4 v6, 0x0

    .line 565
    invoke-interface {v0, v2, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    const/16 v18, 0x1

    .line 570
    .line 571
    add-int/lit8 v0, v0, 0x1

    .line 572
    .line 573
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 593
    .line 594
    .line 595
    const/4 v9, 0x3

    .line 596
    if-lt v0, v9, :cond_10

    .line 597
    .line 598
    invoke-static/range {v20 .. v20}, Ldefpackage/pt0;->d(I)V

    .line 599
    .line 600
    .line 601
    :cond_10
    :goto_9
    return-void

    .line 602
    :catchall_3
    move-exception v0

    .line 603
    const/4 v6, 0x0

    .line 604
    move v10, v6

    .line 605
    :goto_a
    invoke-static {v1, v13, v8}, Ldefpackage/pt0;->b(Landroid/content/Context;Ldefpackage/ss0;Ljava/util/ArrayList;)I

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    add-int/2addr v1, v10

    .line 610
    invoke-static {v1, v5, v4}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-static {v7, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 629
    .line 630
    .line 631
    throw v0

    .line 632
    :catchall_4
    move-exception v0

    .line 633
    :try_start_a
    monitor-exit v9
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 634
    throw v0
.end method
