.class public final Lv24;
.super Luv;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public p:Lli0;

.field public final q:Ljava/util/List;

.field public final r:Lh95;


# direct methods
.method public constructor <init>(Lli0;Lh95;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x17

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {p0, v0, v1}, Luv;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lli0;->e:Ljava/util/List;

    .line 11
    .line 12
    iput-object v0, p0, Lv24;->q:Ljava/util/List;

    .line 13
    .line 14
    iput-object p1, p0, Lv24;->p:Lli0;

    .line 15
    .line 16
    iput-object p2, p0, Lv24;->r:Lh95;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j(Lwe1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(Lwe1;)V
    .locals 3

    .line 1
    new-instance v0, Lvc0;

    .line 2
    .line 3
    const-string v1, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lvc0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lwe1;->F(Lwo4;)Landroid/database/Cursor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lh95;->a(Lwe1;)V

    .line 33
    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    invoke-static {p1}, Lh95;->b(Lwe1;)Lu24;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-boolean v1, v0, Lu24;->a:Z

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "Pre-packaged database has an invalid schema: "

    .line 47
    .line 48
    iget-object p1, v0, Lu24;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p1, p0}, Lnz2;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    :goto_1
    iget-object p1, p1, Lwe1;->n:Landroid/database/sqlite/SQLiteDatabase;

    .line 55
    .line 56
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'86254750241babac4b8d52996a675549\')"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lv24;->q:Ljava/util/List;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lm30;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    return-void

    .line 91
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    invoke-static {v0, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public final o(Lwe1;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lv24;->q(Lwe1;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final p(Lwe1;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lwe1;->n:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    new-instance v1, Lvc0;

    .line 4
    .line 5
    const-string v2, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lvc0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v1}, Lwe1;->F(Lwo4;)Landroid/database/Cursor;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_0
    move v2, v3

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    new-instance v2, Lvc0;

    .line 40
    .line 41
    const-string v4, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 42
    .line 43
    invoke-direct {v2, v4}, Lvc0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v2}, Lwe1;->F(Lwo4;)Landroid/database/Cursor;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move-object v3, v1

    .line 64
    :goto_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 65
    .line 66
    .line 67
    const-string v2, "86254750241babac4b8d52996a675549"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    const-string v2, "1cbd3130fa23b59692c061c594c16cc0"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    const-string p0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: "

    .line 85
    .line 86
    invoke-static {p0, v3}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 95
    :catchall_2
    move-exception p1

    .line 96
    invoke-static {v2, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_3
    invoke-static {p1}, Lh95;->b(Lwe1;)Lu24;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-boolean v3, v2, Lu24;->a:Z

    .line 105
    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    const-string v2, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v2, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'86254750241babac4b8d52996a675549\')"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    :goto_3
    iget-object v2, p0, Lv24;->r:Lh95;

    .line 119
    .line 120
    iget-object v2, v2, Lh95;->n:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 123
    .line 124
    const-string v3, "PRAGMA foreign_keys = ON"

    .line 125
    .line 126
    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v0, Lpo4;

    .line 130
    .line 131
    invoke-direct {v0, p1}, Lpo4;-><init>(Lwe1;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v0}, Ls24;->p(Lx34;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lv24;->q:Ljava/util/List;

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Lm30;

    .line 156
    .line 157
    invoke-virtual {v2, p1}, Lm30;->a(Lwe1;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    iput-object v1, p0, Lv24;->p:Lli0;

    .line 162
    .line 163
    return-void

    .line 164
    :cond_6
    const-string p0, "Pre-packaged database has an invalid schema: "

    .line 165
    .line 166
    iget-object p1, v2, Lu24;->b:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {p1, p0}, Lnz2;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :goto_5
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 173
    :catchall_3
    move-exception p1

    .line 174
    invoke-static {v1, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw p1
.end method

.method public final q(Lwe1;II)V
    .locals 4

    .line 1
    iget-object v0, p1, Lwe1;->n:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    iget-object v1, p0, Lv24;->p:Lli0;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v1, v1, Lli0;->d:Lpz1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v1, p2, p3}, Lsi0;->u(Lpz1;II)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    new-instance p0, Lpo4;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lpo4;-><init>(Lwe1;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lxl;->l(Lx34;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Ljw2;

    .line 41
    .line 42
    new-instance p3, Lpo4;

    .line 43
    .line 44
    invoke-direct {p3, p1}, Lpo4;-><init>(Lwe1;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p3}, Ljw2;->b(Lx34;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {p1}, Lh95;->b(Lwe1;)Lu24;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-boolean p1, p0, Lu24;->a:Z

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    const-string p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string p0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'86254750241babac4b8d52996a675549\')"

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    const-string p1, "Migration didn\'t properly handle: "

    .line 71
    .line 72
    iget-object p0, p0, Lu24;->b:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p0, p1}, Lnz2;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    iget-object v1, p0, Lv24;->p:Lli0;

    .line 79
    .line 80
    if-eqz v1, :cond_a

    .line 81
    .line 82
    invoke-static {v1, p2, p3}, Lsi0;->B(Lli0;II)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_a

    .line 87
    .line 88
    iget-boolean p2, v1, Lli0;->s:Z

    .line 89
    .line 90
    if-eqz p2, :cond_7

    .line 91
    .line 92
    new-instance p2, Lvc0;

    .line 93
    .line 94
    const-string p3, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    .line 95
    .line 96
    invoke-direct {p2, p3}, Lvc0;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lwe1;->F(Lwo4;)Landroid/database/Cursor;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    :try_start_0
    invoke-static {}, Lgb;->r()Lqb2;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :cond_3
    :goto_1
    invoke-interface {p2}, Landroid/database/Cursor;->moveToNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const/4 v2, 0x0

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-interface {p2, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const-string v3, "sqlite_"

    .line 122
    .line 123
    invoke-static {v1, v3, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_3

    .line 128
    .line 129
    const-string v2, "android_metadata"

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    const/4 v2, 0x1

    .line 139
    invoke-interface {p2, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const-string v3, "view"

    .line 144
    .line 145
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-instance v3, Lkd3;

    .line 154
    .line 155
    invoke-direct {v3, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, v3}, Lqb2;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception p0

    .line 163
    goto :goto_3

    .line 164
    :cond_5
    invoke-static {p3}, Lgb;->f(Lqb2;)Lqb2;

    .line 165
    .line 166
    .line 167
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p3, v2}, Lqb2;->listIterator(I)Ljava/util/ListIterator;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    :goto_2
    move-object p3, p2

    .line 176
    check-cast p3, Ldm1;

    .line 177
    .line 178
    invoke-virtual {p3}, Ldm1;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_8

    .line 183
    .line 184
    invoke-virtual {p3}, Ldm1;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    check-cast p3, Lkd3;

    .line 189
    .line 190
    iget-object v1, p3, Lkd3;->n:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Ljava/lang/String;

    .line 193
    .line 194
    iget-object p3, p3, Lkd3;->o:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p3, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result p3

    .line 202
    if-eqz p3, :cond_6

    .line 203
    .line 204
    new-instance p3, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v2, "DROP VIEW IF EXISTS "

    .line 207
    .line 208
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-virtual {v0, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    new-instance p3, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v2, "DROP TABLE IF EXISTS "

    .line 225
    .line 226
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p3

    .line 236
    invoke-virtual {v0, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    :catchall_1
    move-exception p1

    .line 242
    invoke-static {p2, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_7
    const-string p2, "DROP TABLE IF EXISTS `Dependency`"

    .line 247
    .line 248
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    const-string p2, "DROP TABLE IF EXISTS `WorkSpec`"

    .line 252
    .line 253
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const-string p2, "DROP TABLE IF EXISTS `WorkTag`"

    .line 257
    .line 258
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const-string p2, "DROP TABLE IF EXISTS `SystemIdInfo`"

    .line 262
    .line 263
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    const-string p2, "DROP TABLE IF EXISTS `WorkName`"

    .line 267
    .line 268
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const-string p2, "DROP TABLE IF EXISTS `WorkProgress`"

    .line 272
    .line 273
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string p2, "DROP TABLE IF EXISTS `Preference`"

    .line 277
    .line 278
    invoke-virtual {v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_8
    iget-object p0, p0, Lv24;->q:Ljava/util/List;

    .line 282
    .line 283
    if-eqz p0, :cond_9

    .line 284
    .line 285
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result p2

    .line 293
    if-eqz p2, :cond_9

    .line 294
    .line 295
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    check-cast p2, Lm30;

    .line 300
    .line 301
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_9
    invoke-static {p1}, Lh95;->a(Lwe1;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_a
    const-string p0, " to "

    .line 310
    .line 311
    const-string p1, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    .line 312
    .line 313
    const-string v0, "A migration from "

    .line 314
    .line 315
    invoke-static {v0, p0, p2, p3, p1}, Lb11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    return-void
.end method
