.class public final Lcom/bumptech/glide/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile u:Lcom/bumptech/glide/a;

.field public static volatile v:Z


# instance fields
.field public final n:Ldefpackage/zs;

.field public final o:Ldefpackage/pf2;

.field public final p:Ldefpackage/ii1;

.field public final q:Ldefpackage/qj0;

.field public final r:Ldefpackage/e04;

.field public final s:Ldefpackage/i80;

.field public final t:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldefpackage/i11;Ldefpackage/pf2;Ldefpackage/zs;Ldefpackage/qj0;Ldefpackage/e04;Ldefpackage/i80;ILdefpackage/fi1;Ldefpackage/oi;Ljava/util/List;Ljava/util/List;Ldefpackage/g12;Ldefpackage/d34;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/bumptech/glide/a;->n:Ldefpackage/zs;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/bumptech/glide/a;->q:Ldefpackage/qj0;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/bumptech/glide/a;->o:Ldefpackage/pf2;

    .line 16
    .line 17
    iput-object p6, p0, Lcom/bumptech/glide/a;->r:Ldefpackage/e04;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/bumptech/glide/a;->s:Ldefpackage/i80;

    .line 20
    .line 21
    new-instance p4, Ldefpackage/ll;

    .line 22
    .line 23
    invoke-direct {p4, p0, p12, p13}, Ldefpackage/ll;-><init>(Lcom/bumptech/glide/a;Ljava/util/List;Ldefpackage/g12;)V

    .line 24
    .line 25
    .line 26
    move-object p3, p5

    .line 27
    new-instance p5, Ldefpackage/tv1;

    .line 28
    .line 29
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    move-object p6, p9

    .line 33
    move-object p9, p2

    .line 34
    move-object p2, p1

    .line 35
    new-instance p1, Ldefpackage/ii1;

    .line 36
    .line 37
    move-object p7, p11

    .line 38
    move p11, p8

    .line 39
    move-object p8, p7

    .line 40
    move-object p7, p10

    .line 41
    move-object p10, p14

    .line 42
    invoke-direct/range {p1 .. p11}, Ldefpackage/ii1;-><init>(Landroid/content/Context;Ldefpackage/qj0;Ldefpackage/ll;Ldefpackage/tv1;Ldefpackage/fi1;Ldefpackage/oi;Ljava/util/List;Ldefpackage/i11;Ldefpackage/d34;I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/bumptech/glide/a;->p:Ldefpackage/ii1;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/bumptech/glide/a;
    .locals 5

    .line 1
    sget-object v0, Lcom/bumptech/glide/a;->u:Lcom/bumptech/glide/a;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Glide"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    const-class v3, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;

    .line 13
    .line 14
    const-class v4, Landroid/content/Context;

    .line 15
    .line 16
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    move-object v2, v0

    .line 39
    goto :goto_4

    .line 40
    :catch_0
    move-exception p0

    .line 41
    goto :goto_0

    .line 42
    :catch_1
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :catch_2
    move-exception p0

    .line 45
    goto :goto_2

    .line 46
    :catch_3
    move-exception p0

    .line 47
    goto :goto_3

    .line 48
    :goto_0
    const-string v0, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 49
    .line 50
    invoke-static {v0, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :goto_1
    const-string v0, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-static {v0, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-object v2

    .line 60
    :goto_2
    const-string v0, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 61
    .line 62
    invoke-static {v0, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :goto_3
    const-string v0, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 67
    .line 68
    invoke-static {v0, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :catch_4
    const/4 v0, 0x5

    .line 73
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 80
    .line 81
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    :cond_0
    :goto_4
    const-class v0, Lcom/bumptech/glide/a;

    .line 85
    .line 86
    monitor-enter v0

    .line 87
    :try_start_1
    sget-object v1, Lcom/bumptech/glide/a;->u:Lcom/bumptech/glide/a;

    .line 88
    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    sget-boolean v1, Lcom/bumptech/glide/a;->v:Z

    .line 92
    .line 93
    if-nez v1, :cond_1

    .line 94
    .line 95
    const/4 v1, 0x1

    .line 96
    sput-boolean v1, Lcom/bumptech/glide/a;->v:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    :try_start_2
    invoke-static {p0, v2}, Lcom/bumptech/glide/a;->b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    .line 101
    .line 102
    :try_start_3
    sput-boolean v1, Lcom/bumptech/glide/a;->v:Z

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    sput-boolean v1, Lcom/bumptech/glide/a;->v:Z

    .line 107
    .line 108
    throw p0

    .line 109
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v1, "Glide has been called recursively, this is probably an internal library error!"

    .line 112
    .line 113
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :cond_2
    :goto_5
    monitor-exit v0

    .line 118
    goto :goto_6

    .line 119
    :catchall_1
    move-exception p0

    .line 120
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    throw p0

    .line 122
    :cond_3
    :goto_6
    sget-object p0, Lcom/bumptech/glide/a;->u:Lcom/bumptech/glide/a;

    .line 123
    .line 124
    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 26

    .line 1
    move-object/from16 v13, p1

    .line 2
    .line 3
    new-instance v1, Ldefpackage/hi1;

    .line 4
    .line 5
    invoke-direct {v1}, Ldefpackage/hi1;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    if-eqz v13, :cond_0

    .line 15
    .line 16
    invoke-virtual {v13}, Ldefpackage/g12;->G()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v0, "Got app info metadata: "

    .line 20
    .line 21
    const-string v3, "ManifestParser"

    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    const-string v5, "Loading Glide modules"

    .line 31
    .line 32
    invoke-static {v3, v5}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_1
    new-instance v12, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x0

    .line 42
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    const/16 v9, 0x80

    .line 51
    .line 52
    invoke-virtual {v7, v8, v9}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    if-eqz v7, :cond_6

    .line 57
    .line 58
    iget-object v8, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 59
    .line 60
    if-nez v8, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-static {v3, v5}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_3

    .line 68
    .line 69
    new-instance v8, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-exception v0

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    :goto_0
    iget-object v0, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Ljava/lang/String;

    .line 110
    .line 111
    const-string v9, "GlideModule"

    .line 112
    .line 113
    iget-object v10, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 114
    .line 115
    invoke-virtual {v10, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-nez v9, :cond_4

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    invoke-static {v8}, Ldefpackage/j51;->G(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v6

    .line 130
    :cond_5
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    const-string v0, "Finished loading Glide modules"

    .line 137
    .line 138
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    :goto_2
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    const-string v0, "Got null app info metadata"

    .line 149
    .line 150
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :goto_3
    const/4 v7, 0x6

    .line 155
    invoke-static {v3, v7}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-eqz v7, :cond_7

    .line 160
    .line 161
    const-string v7, "Failed to parse glide modules"

    .line 162
    .line 163
    invoke-static {v3, v7, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 164
    .line 165
    .line 166
    :cond_7
    :goto_4
    if-eqz v13, :cond_9

    .line 167
    .line 168
    invoke-virtual {v13}, Lcom/bumptech/glide/GeneratedAppGlideModule;->V()Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_9

    .line 177
    .line 178
    invoke-virtual {v13}, Lcom/bumptech/glide/GeneratedAppGlideModule;->V()Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-nez v3, :cond_8

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    invoke-static {v0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    throw v0

    .line 197
    :cond_9
    :goto_5
    const-string v0, "Glide"

    .line 198
    .line 199
    invoke-static {v0, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_b

    .line 204
    .line 205
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_a

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_a
    invoke-static {v0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    throw v0

    .line 221
    :cond_b
    :goto_6
    if-eqz v13, :cond_c

    .line 222
    .line 223
    invoke-virtual {v13}, Lcom/bumptech/glide/GeneratedAppGlideModule;->W()Ldefpackage/d04;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    :cond_c
    iput-object v6, v1, Ldefpackage/hi1;->n:Ldefpackage/d04;

    .line 228
    .line 229
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-nez v3, :cond_25

    .line 238
    .line 239
    if-eqz v13, :cond_d

    .line 240
    .line 241
    invoke-virtual {v13, v2, v1}, Ldefpackage/g12;->e(Landroid/content/Context;Ldefpackage/hi1;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    iget-object v0, v1, Ldefpackage/hi1;->g:Ldefpackage/li1;

    .line 245
    .line 246
    const/4 v3, 0x0

    .line 247
    const/4 v6, 0x1

    .line 248
    const/4 v7, 0x4

    .line 249
    if-nez v0, :cond_10

    .line 250
    .line 251
    new-instance v0, Ldefpackage/h5;

    .line 252
    .line 253
    invoke-direct {v0, v6}, Ldefpackage/h5;-><init>(I)V

    .line 254
    .line 255
    .line 256
    sget v8, Ldefpackage/li1;->o:I

    .line 257
    .line 258
    if-nez v8, :cond_e

    .line 259
    .line 260
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    invoke-virtual {v8}, Ljava/lang/Runtime;->availableProcessors()I

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    sput v8, Ldefpackage/li1;->o:I

    .line 273
    .line 274
    :cond_e
    sget v15, Ldefpackage/li1;->o:I

    .line 275
    .line 276
    const-string v8, "source"

    .line 277
    .line 278
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    if-nez v9, :cond_f

    .line 283
    .line 284
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 285
    .line 286
    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 287
    .line 288
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 289
    .line 290
    .line 291
    new-instance v9, Ldefpackage/ki1;

    .line 292
    .line 293
    invoke-direct {v9, v0, v8, v3}, Ldefpackage/ki1;-><init>(Ldefpackage/h5;Ljava/lang/String;Z)V

    .line 294
    .line 295
    .line 296
    const-wide/16 v17, 0x0

    .line 297
    .line 298
    sget-object v19, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 299
    .line 300
    move/from16 v16, v15

    .line 301
    .line 302
    move-object/from16 v21, v9

    .line 303
    .line 304
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 305
    .line 306
    .line 307
    new-instance v0, Ldefpackage/li1;

    .line 308
    .line 309
    invoke-direct {v0, v14}, Ldefpackage/li1;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 310
    .line 311
    .line 312
    iput-object v0, v1, Ldefpackage/hi1;->g:Ldefpackage/li1;

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_f
    const-string v0, "Name must be non-null and non-empty, but given: source"

    .line 316
    .line 317
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_10
    :goto_7
    iget-object v0, v1, Ldefpackage/hi1;->h:Ldefpackage/li1;

    .line 322
    .line 323
    if-nez v0, :cond_12

    .line 324
    .line 325
    new-instance v0, Ldefpackage/h5;

    .line 326
    .line 327
    invoke-direct {v0, v6}, Ldefpackage/h5;-><init>(I)V

    .line 328
    .line 329
    .line 330
    const-string v8, "disk-cache"

    .line 331
    .line 332
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-nez v9, :cond_11

    .line 337
    .line 338
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 339
    .line 340
    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 341
    .line 342
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 343
    .line 344
    .line 345
    new-instance v9, Ldefpackage/ki1;

    .line 346
    .line 347
    const/4 v15, 0x1

    .line 348
    invoke-direct {v9, v0, v8, v15}, Ldefpackage/ki1;-><init>(Ldefpackage/h5;Ljava/lang/String;Z)V

    .line 349
    .line 350
    .line 351
    const-wide/16 v17, 0x0

    .line 352
    .line 353
    sget-object v19, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 354
    .line 355
    move/from16 v16, v15

    .line 356
    .line 357
    move-object/from16 v21, v9

    .line 358
    .line 359
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 360
    .line 361
    .line 362
    new-instance v0, Ldefpackage/li1;

    .line 363
    .line 364
    invoke-direct {v0, v14}, Ldefpackage/li1;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 365
    .line 366
    .line 367
    iput-object v0, v1, Ldefpackage/hi1;->h:Ldefpackage/li1;

    .line 368
    .line 369
    goto :goto_8

    .line 370
    :cond_11
    const-string v0, "Name must be non-null and non-empty, but given: disk-cache"

    .line 371
    .line 372
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    :cond_12
    :goto_8
    iget-object v0, v1, Ldefpackage/hi1;->o:Ldefpackage/li1;

    .line 377
    .line 378
    if-nez v0, :cond_16

    .line 379
    .line 380
    sget v0, Ldefpackage/li1;->o:I

    .line 381
    .line 382
    if-nez v0, :cond_13

    .line 383
    .line 384
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    sput v0, Ldefpackage/li1;->o:I

    .line 397
    .line 398
    :cond_13
    sget v0, Ldefpackage/li1;->o:I

    .line 399
    .line 400
    if-lt v0, v7, :cond_14

    .line 401
    .line 402
    move v15, v5

    .line 403
    goto :goto_9

    .line 404
    :cond_14
    move v15, v6

    .line 405
    :goto_9
    new-instance v0, Ldefpackage/h5;

    .line 406
    .line 407
    invoke-direct {v0, v6}, Ldefpackage/h5;-><init>(I)V

    .line 408
    .line 409
    .line 410
    const-string v5, "animation"

    .line 411
    .line 412
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    if-nez v8, :cond_15

    .line 417
    .line 418
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 419
    .line 420
    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 421
    .line 422
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 423
    .line 424
    .line 425
    new-instance v8, Ldefpackage/ki1;

    .line 426
    .line 427
    invoke-direct {v8, v0, v5, v6}, Ldefpackage/ki1;-><init>(Ldefpackage/h5;Ljava/lang/String;Z)V

    .line 428
    .line 429
    .line 430
    const-wide/16 v17, 0x0

    .line 431
    .line 432
    sget-object v19, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 433
    .line 434
    move/from16 v16, v15

    .line 435
    .line 436
    move-object/from16 v21, v8

    .line 437
    .line 438
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 439
    .line 440
    .line 441
    new-instance v0, Ldefpackage/li1;

    .line 442
    .line 443
    invoke-direct {v0, v14}, Ldefpackage/li1;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 444
    .line 445
    .line 446
    iput-object v0, v1, Ldefpackage/hi1;->o:Ldefpackage/li1;

    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_15
    const-string v0, "Name must be non-null and non-empty, but given: animation"

    .line 450
    .line 451
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :cond_16
    :goto_a
    iget-object v0, v1, Ldefpackage/hi1;->j:Ldefpackage/v2;

    .line 456
    .line 457
    if-nez v0, :cond_1c

    .line 458
    .line 459
    new-instance v0, Ldefpackage/mu2;

    .line 460
    .line 461
    invoke-direct {v0, v2}, Ldefpackage/mu2;-><init>(Landroid/content/Context;)V

    .line 462
    .line 463
    .line 464
    new-instance v5, Ldefpackage/v2;

    .line 465
    .line 466
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 467
    .line 468
    .line 469
    iget-object v8, v0, Ldefpackage/mu2;->a:Landroid/content/Context;

    .line 470
    .line 471
    iget v9, v0, Ldefpackage/mu2;->d:F

    .line 472
    .line 473
    iget-object v10, v0, Ldefpackage/mu2;->b:Landroid/app/ActivityManager;

    .line 474
    .line 475
    invoke-virtual {v10}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    if-eqz v11, :cond_17

    .line 480
    .line 481
    const/high16 v11, 0x200000

    .line 482
    .line 483
    goto :goto_b

    .line 484
    :cond_17
    const/high16 v11, 0x400000

    .line 485
    .line 486
    :goto_b
    iput v11, v5, Ldefpackage/v2;->c:I

    .line 487
    .line 488
    invoke-virtual {v10}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    const/high16 v15, 0x100000

    .line 493
    .line 494
    mul-int/2addr v14, v15

    .line 495
    invoke-virtual {v10}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 496
    .line 497
    .line 498
    move-result v15

    .line 499
    int-to-float v14, v14

    .line 500
    if-eqz v15, :cond_18

    .line 501
    .line 502
    const v15, 0x3ea8f5c3    # 0.33f

    .line 503
    .line 504
    .line 505
    goto :goto_c

    .line 506
    :cond_18
    const v15, 0x3ecccccd    # 0.4f

    .line 507
    .line 508
    .line 509
    :goto_c
    mul-float/2addr v14, v15

    .line 510
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 511
    .line 512
    .line 513
    move-result v14

    .line 514
    iget-object v0, v0, Ldefpackage/mu2;->c:Ldefpackage/si1;

    .line 515
    .line 516
    iget-object v0, v0, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 519
    .line 520
    iget v15, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 521
    .line 522
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 523
    .line 524
    mul-int/2addr v15, v0

    .line 525
    mul-int/2addr v15, v7

    .line 526
    int-to-float v0, v15

    .line 527
    mul-float v7, v0, v9

    .line 528
    .line 529
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 530
    .line 531
    .line 532
    move-result v7

    .line 533
    const/high16 v15, 0x40000000    # 2.0f

    .line 534
    .line 535
    mul-float/2addr v0, v15

    .line 536
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    move/from16 p0, v15

    .line 541
    .line 542
    sub-int v15, v14, v11

    .line 543
    .line 544
    add-int v3, v0, v7

    .line 545
    .line 546
    if-gt v3, v15, :cond_19

    .line 547
    .line 548
    iput v0, v5, Ldefpackage/v2;->b:I

    .line 549
    .line 550
    iput v7, v5, Ldefpackage/v2;->a:I

    .line 551
    .line 552
    goto :goto_d

    .line 553
    :cond_19
    int-to-float v0, v15

    .line 554
    add-float v15, v9, p0

    .line 555
    .line 556
    div-float/2addr v0, v15

    .line 557
    mul-float v15, v0, p0

    .line 558
    .line 559
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    iput v7, v5, Ldefpackage/v2;->b:I

    .line 564
    .line 565
    mul-float/2addr v0, v9

    .line 566
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    iput v0, v5, Ldefpackage/v2;->a:I

    .line 571
    .line 572
    :goto_d
    const-string v0, "MemorySizeCalculator"

    .line 573
    .line 574
    invoke-static {v0, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    if-eqz v4, :cond_1b

    .line 579
    .line 580
    new-instance v4, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    const-string v7, "Calculation complete, Calculated memory cache size: "

    .line 583
    .line 584
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    iget v7, v5, Ldefpackage/v2;->b:I

    .line 588
    .line 589
    int-to-long v6, v7

    .line 590
    invoke-static {v8, v6, v7}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    const-string v6, ", pool size: "

    .line 598
    .line 599
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    iget v6, v5, Ldefpackage/v2;->a:I

    .line 603
    .line 604
    int-to-long v6, v6

    .line 605
    invoke-static {v8, v6, v7}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    const-string v6, ", byte array size: "

    .line 613
    .line 614
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    int-to-long v6, v11

    .line 618
    invoke-static {v8, v6, v7}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string v6, ", memory class limited? "

    .line 626
    .line 627
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    if-le v3, v14, :cond_1a

    .line 631
    .line 632
    const/4 v3, 0x1

    .line 633
    goto :goto_e

    .line 634
    :cond_1a
    const/4 v3, 0x0

    .line 635
    :goto_e
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    const-string v3, ", max size: "

    .line 639
    .line 640
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    int-to-long v6, v14

    .line 644
    invoke-static {v8, v6, v7}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    const-string v3, ", memoryClass: "

    .line 652
    .line 653
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v10}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    const-string v3, ", isLowMemoryDevice: "

    .line 664
    .line 665
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v10}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v3

    .line 679
    invoke-static {v0, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 680
    .line 681
    .line 682
    :cond_1b
    iput-object v5, v1, Ldefpackage/hi1;->j:Ldefpackage/v2;

    .line 683
    .line 684
    :cond_1c
    iget-object v0, v1, Ldefpackage/hi1;->k:Ldefpackage/i80;

    .line 685
    .line 686
    if-nez v0, :cond_1d

    .line 687
    .line 688
    new-instance v0, Ldefpackage/i80;

    .line 689
    .line 690
    const/16 v3, 0x19

    .line 691
    .line 692
    invoke-direct {v0, v3}, Ldefpackage/i80;-><init>(I)V

    .line 693
    .line 694
    .line 695
    iput-object v0, v1, Ldefpackage/hi1;->k:Ldefpackage/i80;

    .line 696
    .line 697
    :cond_1d
    iget-object v0, v1, Ldefpackage/hi1;->d:Ldefpackage/zs;

    .line 698
    .line 699
    if-nez v0, :cond_1f

    .line 700
    .line 701
    iget-object v0, v1, Ldefpackage/hi1;->j:Ldefpackage/v2;

    .line 702
    .line 703
    iget v0, v0, Ldefpackage/v2;->a:I

    .line 704
    .line 705
    if-lez v0, :cond_1e

    .line 706
    .line 707
    new-instance v3, Ldefpackage/nf2;

    .line 708
    .line 709
    int-to-long v4, v0

    .line 710
    invoke-direct {v3, v4, v5}, Ldefpackage/nf2;-><init>(J)V

    .line 711
    .line 712
    .line 713
    iput-object v3, v1, Ldefpackage/hi1;->d:Ldefpackage/zs;

    .line 714
    .line 715
    goto :goto_f

    .line 716
    :cond_1e
    new-instance v0, Ldefpackage/pa;

    .line 717
    .line 718
    const/16 v3, 0x13

    .line 719
    .line 720
    invoke-direct {v0, v3}, Ldefpackage/pa;-><init>(I)V

    .line 721
    .line 722
    .line 723
    iput-object v0, v1, Ldefpackage/hi1;->d:Ldefpackage/zs;

    .line 724
    .line 725
    :cond_1f
    :goto_f
    iget-object v0, v1, Ldefpackage/hi1;->e:Ldefpackage/qj0;

    .line 726
    .line 727
    if-nez v0, :cond_20

    .line 728
    .line 729
    new-instance v0, Ldefpackage/qj0;

    .line 730
    .line 731
    iget-object v3, v1, Ldefpackage/hi1;->j:Ldefpackage/v2;

    .line 732
    .line 733
    iget v3, v3, Ldefpackage/v2;->c:I

    .line 734
    .line 735
    invoke-direct {v0, v3}, Ldefpackage/qj0;-><init>(I)V

    .line 736
    .line 737
    .line 738
    iput-object v0, v1, Ldefpackage/hi1;->e:Ldefpackage/qj0;

    .line 739
    .line 740
    :cond_20
    iget-object v0, v1, Ldefpackage/hi1;->f:Ldefpackage/pf2;

    .line 741
    .line 742
    if-nez v0, :cond_21

    .line 743
    .line 744
    new-instance v0, Ldefpackage/pf2;

    .line 745
    .line 746
    iget-object v3, v1, Ldefpackage/hi1;->j:Ldefpackage/v2;

    .line 747
    .line 748
    iget v3, v3, Ldefpackage/v2;->b:I

    .line 749
    .line 750
    int-to-long v3, v3

    .line 751
    invoke-direct {v0, v3, v4}, Ldefpackage/sj0;-><init>(J)V

    .line 752
    .line 753
    .line 754
    iput-object v0, v1, Ldefpackage/hi1;->f:Ldefpackage/pf2;

    .line 755
    .line 756
    :cond_21
    iget-object v0, v1, Ldefpackage/hi1;->i:Ldefpackage/e20;

    .line 757
    .line 758
    if-nez v0, :cond_22

    .line 759
    .line 760
    new-instance v0, Ldefpackage/e20;

    .line 761
    .line 762
    const-string v3, "image_manager_disk_cache"

    .line 763
    .line 764
    const-wide/32 v4, 0xfa00000

    .line 765
    .line 766
    .line 767
    invoke-direct {v0, v2, v3, v4, v5}, Ldefpackage/e20;-><init>(Landroid/content/Context;Ljava/lang/String;J)V

    .line 768
    .line 769
    .line 770
    iput-object v0, v1, Ldefpackage/hi1;->i:Ldefpackage/e20;

    .line 771
    .line 772
    :cond_22
    iget-object v0, v1, Ldefpackage/hi1;->c:Ldefpackage/i11;

    .line 773
    .line 774
    if-nez v0, :cond_23

    .line 775
    .line 776
    new-instance v3, Ldefpackage/i11;

    .line 777
    .line 778
    iget-object v4, v1, Ldefpackage/hi1;->f:Ldefpackage/pf2;

    .line 779
    .line 780
    iget-object v5, v1, Ldefpackage/hi1;->i:Ldefpackage/e20;

    .line 781
    .line 782
    iget-object v6, v1, Ldefpackage/hi1;->h:Ldefpackage/li1;

    .line 783
    .line 784
    iget-object v7, v1, Ldefpackage/hi1;->g:Ldefpackage/li1;

    .line 785
    .line 786
    new-instance v8, Ldefpackage/li1;

    .line 787
    .line 788
    new-instance v17, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 789
    .line 790
    new-instance v23, Ljava/util/concurrent/SynchronousQueue;

    .line 791
    .line 792
    invoke-direct/range {v23 .. v23}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 793
    .line 794
    .line 795
    new-instance v0, Ldefpackage/ki1;

    .line 796
    .line 797
    new-instance v9, Ldefpackage/h5;

    .line 798
    .line 799
    const/4 v10, 0x1

    .line 800
    invoke-direct {v9, v10}, Ldefpackage/h5;-><init>(I)V

    .line 801
    .line 802
    .line 803
    const-string v10, "source-unlimited"

    .line 804
    .line 805
    const/4 v11, 0x0

    .line 806
    invoke-direct {v0, v9, v10, v11}, Ldefpackage/ki1;-><init>(Ldefpackage/h5;Ljava/lang/String;Z)V

    .line 807
    .line 808
    .line 809
    const/16 v18, 0x0

    .line 810
    .line 811
    const v19, 0x7fffffff

    .line 812
    .line 813
    .line 814
    const-wide/16 v20, 0x2710

    .line 815
    .line 816
    sget-object v22, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 817
    .line 818
    move-object/from16 v24, v0

    .line 819
    .line 820
    invoke-direct/range {v17 .. v24}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 821
    .line 822
    .line 823
    move-object/from16 v0, v17

    .line 824
    .line 825
    invoke-direct {v8, v0}, Ldefpackage/li1;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 826
    .line 827
    .line 828
    iget-object v9, v1, Ldefpackage/hi1;->o:Ldefpackage/li1;

    .line 829
    .line 830
    invoke-direct/range {v3 .. v9}, Ldefpackage/i11;-><init>(Ldefpackage/pf2;Ldefpackage/e20;Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/li1;)V

    .line 831
    .line 832
    .line 833
    iput-object v3, v1, Ldefpackage/hi1;->c:Ldefpackage/i11;

    .line 834
    .line 835
    :cond_23
    iget-object v0, v1, Ldefpackage/hi1;->p:Ljava/util/List;

    .line 836
    .line 837
    if-nez v0, :cond_24

    .line 838
    .line 839
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 840
    .line 841
    iput-object v0, v1, Ldefpackage/hi1;->p:Ljava/util/List;

    .line 842
    .line 843
    goto :goto_10

    .line 844
    :cond_24
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    iput-object v0, v1, Ldefpackage/hi1;->p:Ljava/util/List;

    .line 849
    .line 850
    :goto_10
    iget-object v0, v1, Ldefpackage/hi1;->b:Ldefpackage/zg5;

    .line 851
    .line 852
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    new-instance v14, Ldefpackage/d34;

    .line 856
    .line 857
    invoke-direct {v14, v0}, Ldefpackage/d34;-><init>(Ldefpackage/zg5;)V

    .line 858
    .line 859
    .line 860
    new-instance v6, Ldefpackage/e04;

    .line 861
    .line 862
    iget-object v0, v1, Ldefpackage/hi1;->n:Ldefpackage/d04;

    .line 863
    .line 864
    invoke-direct {v6, v0}, Ldefpackage/e04;-><init>(Ldefpackage/d04;)V

    .line 865
    .line 866
    .line 867
    new-instance v0, Lcom/bumptech/glide/a;

    .line 868
    .line 869
    move-object v3, v2

    .line 870
    iget-object v2, v1, Ldefpackage/hi1;->c:Ldefpackage/i11;

    .line 871
    .line 872
    move-object v4, v3

    .line 873
    iget-object v3, v1, Ldefpackage/hi1;->f:Ldefpackage/pf2;

    .line 874
    .line 875
    move-object v5, v4

    .line 876
    iget-object v4, v1, Ldefpackage/hi1;->d:Ldefpackage/zs;

    .line 877
    .line 878
    move-object v7, v5

    .line 879
    iget-object v5, v1, Ldefpackage/hi1;->e:Ldefpackage/qj0;

    .line 880
    .line 881
    move-object v8, v7

    .line 882
    iget-object v7, v1, Ldefpackage/hi1;->k:Ldefpackage/i80;

    .line 883
    .line 884
    move-object v9, v8

    .line 885
    iget v8, v1, Ldefpackage/hi1;->l:I

    .line 886
    .line 887
    move-object v10, v9

    .line 888
    iget-object v9, v1, Ldefpackage/hi1;->m:Ldefpackage/fi1;

    .line 889
    .line 890
    move-object v11, v10

    .line 891
    iget-object v10, v1, Ldefpackage/hi1;->a:Ldefpackage/oi;

    .line 892
    .line 893
    iget-object v1, v1, Ldefpackage/hi1;->p:Ljava/util/List;

    .line 894
    .line 895
    move-object/from16 v25, v11

    .line 896
    .line 897
    move-object v11, v1

    .line 898
    move-object/from16 v1, v25

    .line 899
    .line 900
    invoke-direct/range {v0 .. v14}, Lcom/bumptech/glide/a;-><init>(Landroid/content/Context;Ldefpackage/i11;Ldefpackage/pf2;Ldefpackage/zs;Ldefpackage/qj0;Ldefpackage/e04;Ldefpackage/i80;ILdefpackage/fi1;Ldefpackage/oi;Ljava/util/List;Ljava/util/List;Ldefpackage/g12;Ldefpackage/d34;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 904
    .line 905
    .line 906
    sput-object v0, Lcom/bumptech/glide/a;->u:Lcom/bumptech/glide/a;

    .line 907
    .line 908
    return-void

    .line 909
    :cond_25
    invoke-static {v0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    throw v0
.end method

.method public static c(Landroid/content/Context;)Ldefpackage/c04;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldefpackage/h12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lcom/bumptech/glide/a;->r:Ldefpackage/e04;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ldefpackage/e04;->b(Landroid/content/Context;)Ldefpackage/c04;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/e35;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/a;->o:Ldefpackage/pf2;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Ldefpackage/sj0;->f(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/a;->n:Ldefpackage/zs;

    .line 12
    .line 13
    invoke-interface {v0}, Ldefpackage/zs;->k()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/bumptech/glide/a;->q:Ldefpackage/qj0;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    const/4 v0, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0, v0}, Ldefpackage/qj0;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 9

    .line 1
    invoke-static {}, Ldefpackage/e35;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v4, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    check-cast v5, Ldefpackage/c04;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v1, p0, Lcom/bumptech/glide/a;->o:Ldefpackage/pf2;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    const/16 v2, 0x14

    .line 40
    .line 41
    const/16 v4, 0x28

    .line 42
    .line 43
    if-lt p1, v4, :cond_1

    .line 44
    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    invoke-virtual {v1, v5, v6}, Ldefpackage/sj0;->f(J)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-ge p1, v2, :cond_2

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    :cond_2
    monitor-enter v1

    .line 56
    :try_start_1
    iget-wide v5, v1, Ldefpackage/sj0;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 57
    .line 58
    monitor-exit v1

    .line 59
    const-wide/16 v7, 0x2

    .line 60
    .line 61
    div-long/2addr v5, v7

    .line 62
    invoke-virtual {v1, v5, v6}, Ldefpackage/sj0;->f(J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/a;->n:Ldefpackage/zs;

    .line 66
    .line 67
    invoke-interface {v1, p1}, Ldefpackage/zs;->j(I)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lcom/bumptech/glide/a;->q:Ldefpackage/qj0;

    .line 71
    .line 72
    monitor-enter p0

    .line 73
    if-lt p1, v4, :cond_4

    .line 74
    .line 75
    :try_start_2
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    :try_start_3
    invoke-virtual {p0, v3}, Ldefpackage/qj0;->c(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    .line 78
    .line 79
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 80
    goto :goto_2

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 83
    :try_start_6
    throw p1

    .line 84
    :cond_4
    if-ge p1, v2, :cond_5

    .line 85
    .line 86
    if-ne p1, v0, :cond_6

    .line 87
    .line 88
    :cond_5
    iget p1, p0, Ldefpackage/qj0;->a:I

    .line 89
    .line 90
    div-int/lit8 p1, p1, 0x2

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ldefpackage/qj0;->c(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_2
    monitor-exit p0

    .line 96
    return-void

    .line 97
    :catchall_2
    move-exception p1

    .line 98
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 99
    throw p1

    .line 100
    :catchall_3
    move-exception p0

    .line 101
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 102
    throw p0

    .line 103
    :goto_3
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 104
    throw p0
.end method
