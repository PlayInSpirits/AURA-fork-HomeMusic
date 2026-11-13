.class public final Ldefpackage/rf2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Ldefpackage/y34;
.implements Ldefpackage/bi0;
.implements Ldefpackage/fn1;
.implements Lcom/eddyizm/tempus/interfaces/SystemCallback;


# static fields
.field public static final p:[Ljava/lang/String;


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    const-string v1, "last_touch_timestamp"

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ldefpackage/rf2;->p:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    sparse-switch p1, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ldefpackage/m45;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, Ldefpackage/m45;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Ldefpackage/m45;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ldefpackage/m45;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 21
    .line 22
    return-void

    .line 23
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance p1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance p1, Ldefpackage/w03;

    .line 45
    .line 46
    invoke-direct {p1}, Ldefpackage/w03;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p1, Ldefpackage/w03;

    .line 52
    .line 53
    invoke-direct {p1}, Ldefpackage/w03;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 57
    .line 58
    return-void

    .line 59
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 63
    .line 64
    const/16 v0, 0x200

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 70
    .line 71
    new-instance v0, Ljava/io/DataOutputStream;

    .line 72
    .line 73
    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 77
    .line 78
    return-void

    .line 79
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0x10 -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 86
    new-instance v0, Ldefpackage/bl0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldefpackage/bl0;-><init>(I)V

    invoke-direct {p0, p1, v0}, Ldefpackage/rf2;-><init>(Landroid/content/Context;Ldefpackage/bi0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/bi0;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    iput-object p2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ldefpackage/o55;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 93
    :goto_0
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 94
    iput-object p2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/ee1;Ldefpackage/kc1;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p2, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 82
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 79
    iput-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ldefpackage/vr1;Ldefpackage/pa;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/p24;Ldefpackage/y34;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    iput-object p1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ldefpackage/bj0;)V
    .locals 3

    .line 1
    monitor-enter p1

    .line 2
    monitor-exit p1

    .line 3
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Ldefpackage/n55;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/n55;-><init>(Ldefpackage/rf2;Ldefpackage/bj0;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Ldefpackage/x34;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/p24;

    .line 7
    .line 8
    const-string v1, ":memory:"

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v0, Ldefpackage/p24;->c:Ldefpackage/li0;

    .line 17
    .line 18
    iget-object v2, v2, Ldefpackage/li0;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :cond_0
    new-instance v2, Ldefpackage/v21;

    .line 32
    .line 33
    iget-boolean v3, v0, Ldefpackage/p24;->a:Z

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    iget-boolean v3, v0, Ldefpackage/p24;->b:Z

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    move v1, v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v1, v5

    .line 52
    :goto_0
    invoke-direct {v2, p1, v1}, Ldefpackage/v21;-><init>(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v2, Ldefpackage/v21;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 58
    .line 59
    .line 60
    iget-object v2, v2, Ldefpackage/v21;->b:Ldefpackage/wo0;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v2}, Ldefpackage/wo0;->D()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    move v4, v5

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_2
    :goto_1
    const/4 v3, 0x0

    .line 73
    :try_start_1
    iget-boolean v6, v0, Ldefpackage/p24;->b:Z

    .line 74
    .line 75
    if-nez v6, :cond_7

    .line 76
    .line 77
    iget-object p0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Ldefpackage/y34;

    .line 80
    .line 81
    invoke-interface {p0, p1}, Ldefpackage/y34;->b(Ljava/lang/String;)Ldefpackage/x34;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    iget-boolean v6, v0, Ldefpackage/p24;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 86
    .line 87
    if-nez v6, :cond_3

    .line 88
    .line 89
    :try_start_2
    iput-boolean v4, v0, Ldefpackage/p24;->b:Z

    .line 90
    .line 91
    invoke-static {v0, p0}, Ldefpackage/p24;->a(Ldefpackage/p24;Ldefpackage/x34;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    .line 93
    .line 94
    :try_start_3
    iput-boolean v5, v0, Ldefpackage/p24;->b:Z

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    iput-boolean v5, v0, Ldefpackage/p24;->b:Z

    .line 99
    .line 100
    throw p0

    .line 101
    :cond_3
    iget-object v5, v0, Ldefpackage/p24;->c:Ldefpackage/li0;

    .line 102
    .line 103
    iget-object v5, v5, Ldefpackage/li0;->g:Ldefpackage/r24;

    .line 104
    .line 105
    sget-object v6, Ldefpackage/r24;->p:Ldefpackage/r24;

    .line 106
    .line 107
    if-ne v5, v6, :cond_4

    .line 108
    .line 109
    const-string v5, "PRAGMA synchronous = NORMAL"

    .line 110
    .line 111
    invoke-static {p0, v5}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    const-string v5, "PRAGMA synchronous = FULL"

    .line 116
    .line 117
    invoke-static {p0, v5}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-static {p0}, Ldefpackage/p24;->b(Ldefpackage/x34;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 124
    .line 125
    invoke-virtual {v0, p0}, Ldefpackage/qz0;->s(Ldefpackage/x34;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 126
    .line 127
    .line 128
    :goto_3
    if-eqz v2, :cond_6

    .line 129
    .line 130
    :try_start_4
    iget-object v0, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Ljava/nio/channels/FileChannel;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    :try_start_5
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 138
    .line 139
    .line 140
    :try_start_6
    iput-object v3, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :catchall_2
    move-exception p0

    .line 144
    iput-object v3, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 145
    .line 146
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 147
    :cond_6
    :goto_4
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_7
    :try_start_7
    const-string p0, "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"

    .line 152
    .line 153
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 159
    :catchall_3
    move-exception p0

    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    :try_start_8
    iget-object v0, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Ljava/nio/channels/FileChannel;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 165
    .line 166
    if-nez v0, :cond_8

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    :try_start_9
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 170
    .line 171
    .line 172
    :try_start_a
    iput-object v3, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :catchall_4
    move-exception p0

    .line 176
    iput-object v3, v2, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 177
    .line 178
    throw p0

    .line 179
    :cond_9
    :goto_5
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 180
    :catchall_5
    move-exception p0

    .line 181
    :goto_6
    if-eqz v4, :cond_a

    .line 182
    .line 183
    :try_start_b
    throw p0

    .line 184
    :catchall_6
    move-exception p0

    .line 185
    goto :goto_7

    .line 186
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v3, "Unable to open database \'"

    .line 191
    .line 192
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string p1, "\'. Was a proper path / name used in Room\'s database builder?"

    .line 199
    .line 200
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 211
    :goto_7
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 212
    .line 213
    .line 214
    throw p0
.end method

.method public c()Ljava/util/HashMap;
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/tk4;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    check-cast v2, Ljava/lang/String;

    .line 20
    .line 21
    sget-object v3, Ldefpackage/rf2;->p:[Ljava/lang/String;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    const/4 v4, 0x2

    .line 61
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    new-instance v6, Ldefpackage/nx;

    .line 66
    .line 67
    invoke-direct {v6, v2, v3, v4, v5}, Ldefpackage/nx;-><init>(JJ)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object v1, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :goto_1
    if-eqz p0, :cond_1

    .line 82
    .line 83
    :try_start_3
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    move-object p0, v0

    .line 89
    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    :goto_2
    throw v1
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    move-object p0, v0

    .line 95
    new-instance v0, Landroidx/media3/database/DatabaseIOException;

    .line 96
    .line 97
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method

.method public declared-synchronized d(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :cond_1
    monitor-exit p0

    .line 47
    return-object v0

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public e(Ldefpackage/cn1;Ldefpackage/ym1;)Ldefpackage/ce3;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/qr2;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/fn1;

    .line 6
    .line 7
    invoke-interface {v1, p1, p2}, Ldefpackage/fn1;->e(Ldefpackage/cn1;Ldefpackage/ym1;)Ldefpackage/ce3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    const/16 p2, 0x9

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p1, p0, v1, p2}, Ldefpackage/qr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public declared-synchronized f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_4

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    check-cast v5, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v6, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/util/List;

    .line 36
    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Ldefpackage/u04;

    .line 55
    .line 56
    iget-object v7, v6, Ldefpackage/u04;->a:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    iget-object v7, v6, Ldefpackage/u04;->b:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    const/4 v7, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v7, v3

    .line 75
    :goto_2
    if-eqz v7, :cond_2

    .line 76
    .line 77
    iget-object v7, v6, Ldefpackage/u04;->b:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_2

    .line 84
    .line 85
    iget-object v6, v6, Ldefpackage/u04;->b:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    throw p1
.end method

.method public g()Ldefpackage/ce3;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/qr2;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/fn1;

    .line 6
    .line 7
    invoke-interface {v1}, Ldefpackage/fn1;->g()Ldefpackage/ce3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    const/16 v2, 0x9

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v0, v1, p0, v3, v2}, Ldefpackage/qr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public h(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tk4;

    .line 4
    .line 5
    const-string v1, " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)"

    .line 6
    .line 7
    const-string v2, "CREATE TABLE "

    .line 8
    .line 9
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "ExoPlayerCacheFileMetadata"

    .line 16
    .line 17
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-static {p2, v3, p1}, Ldefpackage/r45;->a(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/4 v4, 0x1

    .line 39
    if-eq p2, v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    :try_start_1
    invoke-static {p2, v3, p1, v4}, Ldefpackage/r45;->b(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Ljava/lang/String;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v3, "DROP TABLE IF EXISTS "

    .line 58
    .line 59
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p2, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p2, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    :try_start_2
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception p0

    .line 102
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 103
    .line 104
    .line 105
    throw p0
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    :cond_0
    return-void

    .line 107
    :catch_0
    move-exception p0

    .line 108
    new-instance p1, Landroidx/media3/database/DatabaseIOException;

    .line 109
    .line 110
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

.method public i(Ljava/util/Set;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/tk4;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :try_start_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    const-string v3, "name = ?"

    .line 40
    .line 41
    filled-new-array {v1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 59
    .line 60
    .line 61
    throw p0
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    new-instance p1, Landroidx/media3/database/DatabaseIOException;

    .line 64
    .line 65
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    new-instance v3, Ldefpackage/sn1;

    .line 12
    .line 13
    invoke-direct {v3, p0, p1, v1, v2}, Ldefpackage/sn1;-><init>(Ldefpackage/rf2;Ljava/lang/Object;J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public k(JJLjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/tk4;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroid/content/ContentValues;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "name"

    .line 22
    .line 23
    invoke-virtual {v1, v2, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p5, "length"

    .line 27
    .line 28
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p5, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 33
    .line 34
    .line 35
    const-string p1, "last_touch_timestamp"

    .line 36
    .line 37
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ljava/lang/String;

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-virtual {v0, p0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catch_0
    move-exception p0

    .line 54
    new-instance p1, Landroidx/media3/database/DatabaseIOException;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public l(IIII)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/cardview/widget/CardView;->q:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/cardview/widget/CardView;->p:Landroid/graphics/Rect;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    add-int/2addr p1, v1

    .line 15
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    add-int/2addr p2, v1

    .line 18
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    add-int/2addr p3, v1

    .line 21
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 22
    .line 23
    add-int/2addr p4, v0

    .line 24
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/cardview/widget/CardView;->a(Landroidx/cardview/widget/CardView;IIII)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public m()Ldefpackage/ci0;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/zj0;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/bi0;

    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/bi0;->m()Ldefpackage/ci0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, v1, p0}, Ldefpackage/zj0;-><init>(Landroid/content/Context;Ldefpackage/ci0;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public n(ZZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    iget-object v2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Landroid/net/wifi/WifiManager$WifiLock;

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    const-string v2, "android.permission.WAKE_LOCK"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v3, "WifiLockManager"

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const-string p0, "WAKE_LOCK permission not granted, can\'t acquire wake lock for playback"

    .line 25
    .line 26
    invoke-static {v3, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v2, "wifi"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string p0, "WifiManager is null, therefore not creating the WifiLock."

    .line 45
    .line 46
    invoke-static {v3, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    const/4 v2, 0x3

    .line 51
    const-string v3, "ExoPlayer:WifiLockManager"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v3}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Landroid/net/wifi/WifiManager$WifiLock;

    .line 65
    .line 66
    if-nez p0, :cond_3

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    if-eqz p1, :cond_4

    .line 70
    .line 71
    if-eqz p2, :cond_4

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    :cond_4
    if-eqz v1, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public o(Ldefpackage/s55;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Ldefpackage/ur2;

    .line 8
    .line 9
    const/16 v2, 0x1b

    .line 10
    .line 11
    invoke-direct {v1, v2, p0, p1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/fo1;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    :cond_0
    const-string v1, "40"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v0, v1, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const v3, 0x7f1301e7

    .line 24
    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    const-string v1, "41"

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    new-array p1, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {p0, v3, p1}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    new-array p1, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p0, v3, p1}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_3
    :goto_1
    invoke-static {p0, p1}, Ldefpackage/fo1;->a(Ldefpackage/fo1;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ldefpackage/k03;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-static {p2}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p0, p2}, Ldefpackage/ya4;->E(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onNetworkFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/fo1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    new-array p1, p1, [Ljava/lang/Object;

    .line 10
    .line 11
    const v0, 0x7f1301d2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, Ldefpackage/fo1;->a(Ldefpackage/fo1;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->getIndices()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/IndexID3;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/IndexID3;->getArtists()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/IndexID3;->getArtists()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    const/4 p1, 0x0

    .line 85
    :cond_2
    iget-object p2, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ldefpackage/k03;

    .line 88
    .line 89
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Ljava/util/List;

    .line 92
    .line 93
    invoke-static {p1}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p0, p1}, Ldefpackage/ya4;->E(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p2, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public onSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->G()Ldefpackage/na4;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, Lcom/eddyizm/tempus/model/Server;

    .line 12
    .line 13
    new-instance p3, Ldefpackage/oa4;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-direct {p3, p1, p2, v0}, Ldefpackage/oa4;-><init>(Ldefpackage/na4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/lang/Thread;

    .line 20
    .line 21
    invoke-direct {p1, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 25
    .line 26
    .line 27
    new-instance p1, Ldefpackage/mm3;

    .line 28
    .line 29
    invoke-direct {p1}, Ldefpackage/mm3;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ldefpackage/mm3;->h()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/fo1;

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/fo1;->c()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Ldefpackage/fo1;->r(Z)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Ldefpackage/fo1;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 53
    .line 54
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    instance-of p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 p0, 0x0

    .line 66
    :goto_0
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->v()V

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
