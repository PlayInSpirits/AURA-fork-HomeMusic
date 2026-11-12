.class public Lwq2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lvq2;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Landroid/net/Uri;

.field public g:Z

.field public final h:Z

.field public i:I

.field public j:Z

.field public final k:Ljava/util/ArrayList;

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:Landroid/os/Bundle;

.field public t:Landroid/content/IntentSender;

.field public u:Lsp2;

.field public v:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lvq2;Ljava/lang/String;Ljava/lang/String;Z)V
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
    iput-object v0, p0, Lwq2;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lwq2;->r:I

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lwq2;->v:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-object p1, p0, Lwq2;->a:Lvq2;

    .line 22
    .line 23
    iput-object p2, p0, Lwq2;->b:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p3, p0, Lwq2;->c:Ljava/lang/String;

    .line 26
    .line 27
    iput-boolean p4, p0, Lwq2;->h:Z

    .line 28
    .line 29
    return-void
.end method

.method public static b()Lnq2;
    .locals 2

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lyq2;->c()Lui1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lui1;->d:Loq2;

    .line 9
    .line 10
    instance-of v1, v0, Lnq2;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lnq2;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
.end method


# virtual methods
.method public final a()Ltq2;
    .locals 1

    .line 1
    instance-of v0, p0, Ltq2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ltq2;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final c()Lqq2;
    .locals 0

    .line 1
    iget-object p0, p0, Lwq2;->a:Lvq2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lyq2;->b()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lvq2;->a:Lqq2;

    .line 10
    .line 11
    return-object p0
.end method

.method public final d()Z
    .locals 3

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lyq2;->c()Lui1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lui1;->t:Lwq2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-ne v0, p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lwq2;->n:I

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p0}, Lwq2;->c()Lqq2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, Lqq2;->o:Lom1;

    .line 27
    .line 28
    iget-object v0, v0, Lom1;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/content/ComponentName;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v2, "android"

    .line 37
    .line 38
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const-string v0, "android.media.intent.category.LIVE_AUDIO"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lwq2;->l(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const-string v0, "android.media.intent.category.LIVE_VIDEO"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lwq2;->l(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_2

    .line 59
    .line 60
    :goto_0
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_2
    return v1

    .line 63
    :cond_3
    const-string p0, "There is no default route.  The media router has not yet been fully initialized."

    .line 64
    .line 65
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return v1
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lwq2;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lwq2;->u:Lsp2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lwq2;->g:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final g()Z
    .locals 1

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lyq2;->c()Lui1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lui1;->g()Lwq2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne v0, p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final h(Lrq2;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    invoke-static {}, Lyq2;->b()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lwq2;->k:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p1}, Lrq2;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Lrq2;->b:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    move v2, v0

    .line 29
    :cond_2
    :goto_0
    if-ge v2, v1, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    check-cast v3, Landroid/content/IntentFilter;

    .line 38
    .line 39
    if-nez v3, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget-object v4, p1, Lrq2;->b:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Landroid/content/IntentFilter;->hasCategory(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_5
    :goto_1
    return v0

    .line 69
    :cond_6
    const-string p0, "selector must not be null"

    .line 70
    .line 71
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return v0
.end method

.method public final i(Lsp2;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lwq2;->u:Lsp2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eq v2, v1, :cond_22

    .line 9
    .line 10
    iput-object v1, v0, Lwq2;->u:Lsp2;

    .line 11
    .line 12
    if-eqz v1, :cond_22

    .line 13
    .line 14
    iget-object v2, v1, Lsp2;->a:Landroid/os/Bundle;

    .line 15
    .line 16
    iget-object v4, v0, Lwq2;->d:Ljava/lang/String;

    .line 17
    .line 18
    const-string v5, "name"

    .line 19
    .line 20
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-static {v4, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v6, 0x1

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iput-object v4, v0, Lwq2;->d:Ljava/lang/String;

    .line 36
    .line 37
    move v4, v6

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v4, v3

    .line 40
    :goto_0
    iget-object v5, v0, Lwq2;->e:Ljava/lang/String;

    .line 41
    .line 42
    const-string v7, "status"

    .line 43
    .line 44
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iput-object v4, v0, Lwq2;->e:Ljava/lang/String;

    .line 59
    .line 60
    move v4, v6

    .line 61
    :cond_1
    iget-object v5, v0, Lwq2;->f:Landroid/net/Uri;

    .line 62
    .line 63
    const-string v7, "iconUri"

    .line 64
    .line 65
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const/4 v9, 0x0

    .line 70
    if-nez v8, :cond_2

    .line 71
    .line 72
    move-object v8, v9

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    :goto_1
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-nez v4, :cond_3

    .line 89
    .line 90
    move-object v4, v9

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :goto_2
    iput-object v4, v0, Lwq2;->f:Landroid/net/Uri;

    .line 97
    .line 98
    move v4, v6

    .line 99
    :cond_4
    iget-boolean v5, v0, Lwq2;->g:Z

    .line 100
    .line 101
    const-string v7, "enabled"

    .line 102
    .line 103
    invoke-virtual {v2, v7, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eq v5, v8, :cond_5

    .line 108
    .line 109
    invoke-virtual {v2, v7, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    iput-boolean v4, v0, Lwq2;->g:Z

    .line 114
    .line 115
    move v4, v6

    .line 116
    :cond_5
    iget v5, v0, Lwq2;->i:I

    .line 117
    .line 118
    const-string v7, "connectionState"

    .line 119
    .line 120
    invoke-virtual {v2, v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eq v5, v8, :cond_6

    .line 125
    .line 126
    invoke-virtual {v2, v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    iput v4, v0, Lwq2;->i:I

    .line 131
    .line 132
    move v4, v6

    .line 133
    :cond_6
    invoke-virtual {v1}, Lsp2;->b()Ljava/util/ArrayList;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    iget-object v7, v0, Lwq2;->k:Ljava/util/ArrayList;

    .line 138
    .line 139
    if-ne v7, v5, :cond_7

    .line 140
    .line 141
    goto/16 :goto_7

    .line 142
    .line 143
    :cond_7
    if-eqz v7, :cond_11

    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v5}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    :cond_8
    :goto_3
    invoke-interface {v8}, Ljava/util/ListIterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_10

    .line 158
    .line 159
    invoke-interface {v5}, Ljava/util/ListIterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-eqz v10, :cond_10

    .line 164
    .line 165
    invoke-interface {v8}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    check-cast v10, Landroid/content/IntentFilter;

    .line 170
    .line 171
    invoke-interface {v5}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    check-cast v11, Landroid/content/IntentFilter;

    .line 176
    .line 177
    if-ne v10, v11, :cond_9

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_9
    if-eqz v10, :cond_11

    .line 181
    .line 182
    if-nez v11, :cond_a

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_a
    invoke-virtual {v10}, Landroid/content/IntentFilter;->countActions()I

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    invoke-virtual {v11}, Landroid/content/IntentFilter;->countActions()I

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-eq v12, v13, :cond_b

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_b
    move v13, v3

    .line 197
    :goto_4
    if-ge v13, v12, :cond_d

    .line 198
    .line 199
    invoke-virtual {v10, v13}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v14

    .line 203
    invoke-virtual {v11, v13}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    if-nez v14, :cond_c

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_d
    invoke-virtual {v10}, Landroid/content/IntentFilter;->countCategories()I

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    invoke-virtual {v11}, Landroid/content/IntentFilter;->countCategories()I

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    if-eq v12, v13, :cond_e

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_e
    move v13, v3

    .line 229
    :goto_5
    if-ge v13, v12, :cond_8

    .line 230
    .line 231
    invoke-virtual {v10, v13}, Landroid/content/IntentFilter;->getCategory(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-virtual {v11, v13}, Landroid/content/IntentFilter;->getCategory(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    if-nez v14, :cond_f

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_f
    add-int/lit8 v13, v13, 0x1

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_10
    invoke-interface {v8}, Ljava/util/ListIterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-nez v8, :cond_11

    .line 254
    .line 255
    invoke-interface {v5}, Ljava/util/ListIterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-nez v5, :cond_11

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_11
    :goto_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lsp2;->b()Ljava/util/ArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 270
    .line 271
    .line 272
    move v4, v6

    .line 273
    :goto_7
    iget v5, v0, Lwq2;->l:I

    .line 274
    .line 275
    const-string v7, "playbackType"

    .line 276
    .line 277
    invoke-virtual {v2, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    if-eq v5, v8, :cond_12

    .line 282
    .line 283
    invoke-virtual {v2, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    iput v4, v0, Lwq2;->l:I

    .line 288
    .line 289
    move v4, v6

    .line 290
    :cond_12
    iget v5, v0, Lwq2;->m:I

    .line 291
    .line 292
    const-string v7, "playbackStream"

    .line 293
    .line 294
    const/4 v8, -0x1

    .line 295
    invoke-virtual {v2, v7, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-eq v5, v10, :cond_13

    .line 300
    .line 301
    invoke-virtual {v2, v7, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    iput v4, v0, Lwq2;->m:I

    .line 306
    .line 307
    move v4, v6

    .line 308
    :cond_13
    iget v5, v0, Lwq2;->n:I

    .line 309
    .line 310
    const-string v7, "deviceType"

    .line 311
    .line 312
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    if-eq v5, v10, :cond_14

    .line 317
    .line 318
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    iput v4, v0, Lwq2;->n:I

    .line 323
    .line 324
    move v4, v6

    .line 325
    :cond_14
    iget v5, v0, Lwq2;->o:I

    .line 326
    .line 327
    const-string v7, "volumeHandling"

    .line 328
    .line 329
    invoke-virtual {v2, v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    const/4 v11, 0x3

    .line 334
    if-eq v5, v10, :cond_15

    .line 335
    .line 336
    invoke-virtual {v2, v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    iput v4, v0, Lwq2;->o:I

    .line 341
    .line 342
    move v4, v11

    .line 343
    :cond_15
    iget v5, v0, Lwq2;->p:I

    .line 344
    .line 345
    const-string v7, "volume"

    .line 346
    .line 347
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    if-eq v5, v10, :cond_16

    .line 352
    .line 353
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    iput v4, v0, Lwq2;->p:I

    .line 358
    .line 359
    move v4, v11

    .line 360
    :cond_16
    iget v5, v0, Lwq2;->q:I

    .line 361
    .line 362
    const-string v7, "volumeMax"

    .line 363
    .line 364
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    if-eq v5, v10, :cond_17

    .line 369
    .line 370
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    iput v4, v0, Lwq2;->q:I

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_17
    move v11, v4

    .line 378
    :goto_8
    iget v4, v0, Lwq2;->r:I

    .line 379
    .line 380
    const-string v5, "presentationDisplayId"

    .line 381
    .line 382
    invoke-virtual {v2, v5, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    if-eq v4, v7, :cond_18

    .line 387
    .line 388
    invoke-virtual {v2, v5, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    iput v4, v0, Lwq2;->r:I

    .line 393
    .line 394
    or-int/lit8 v11, v11, 0x5

    .line 395
    .line 396
    :cond_18
    iget-object v4, v0, Lwq2;->s:Landroid/os/Bundle;

    .line 397
    .line 398
    const-string v5, "extras"

    .line 399
    .line 400
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    invoke-static {v4, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    if-nez v4, :cond_19

    .line 409
    .line 410
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    iput-object v4, v0, Lwq2;->s:Landroid/os/Bundle;

    .line 415
    .line 416
    or-int/lit8 v11, v11, 0x1

    .line 417
    .line 418
    :cond_19
    iget-object v4, v0, Lwq2;->t:Landroid/content/IntentSender;

    .line 419
    .line 420
    const-string v5, "settingsIntent"

    .line 421
    .line 422
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    check-cast v7, Landroid/content/IntentSender;

    .line 427
    .line 428
    invoke-static {v4, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-nez v4, :cond_1a

    .line 433
    .line 434
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    check-cast v4, Landroid/content/IntentSender;

    .line 439
    .line 440
    iput-object v4, v0, Lwq2;->t:Landroid/content/IntentSender;

    .line 441
    .line 442
    or-int/lit8 v11, v11, 0x1

    .line 443
    .line 444
    :cond_1a
    iget-boolean v4, v0, Lwq2;->j:Z

    .line 445
    .line 446
    const-string v5, "canDisconnect"

    .line 447
    .line 448
    invoke-virtual {v2, v5, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 449
    .line 450
    .line 451
    move-result v7

    .line 452
    if-eq v4, v7, :cond_1b

    .line 453
    .line 454
    invoke-virtual {v2, v5, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    iput-boolean v2, v0, Lwq2;->j:Z

    .line 459
    .line 460
    or-int/lit8 v11, v11, 0x5

    .line 461
    .line 462
    :cond_1b
    invoke-virtual {v1}, Lsp2;->c()Ljava/util/ArrayList;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    new-instance v2, Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    iget-object v5, v0, Lwq2;->v:Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    if-eq v4, v5, :cond_1c

    .line 482
    .line 483
    move v4, v6

    .line 484
    goto :goto_9

    .line 485
    :cond_1c
    move v4, v3

    .line 486
    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 487
    .line 488
    .line 489
    move-result v5

    .line 490
    if-nez v5, :cond_20

    .line 491
    .line 492
    invoke-static {}, Lyq2;->c()Lui1;

    .line 493
    .line 494
    .line 495
    move-result-object v5

    .line 496
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 497
    .line 498
    .line 499
    move-result v7

    .line 500
    move v8, v3

    .line 501
    :goto_a
    if-ge v8, v7, :cond_20

    .line 502
    .line 503
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    add-int/lit8 v8, v8, 0x1

    .line 508
    .line 509
    check-cast v10, Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    iget-object v12, v0, Lwq2;->a:Lvq2;

    .line 515
    .line 516
    iget-object v12, v12, Lvq2;->d:Lom1;

    .line 517
    .line 518
    iget-object v12, v12, Lom1;->o:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v12, Landroid/content/ComponentName;

    .line 521
    .line 522
    invoke-virtual {v12}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v12

    .line 526
    iget-object v13, v5, Lui1;->j:Ljava/util/HashMap;

    .line 527
    .line 528
    new-instance v14, Lld3;

    .line 529
    .line 530
    invoke-direct {v14, v12, v10}, Lld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    check-cast v10, Ljava/lang/String;

    .line 538
    .line 539
    iget-object v12, v5, Lui1;->h:Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 542
    .line 543
    .line 544
    move-result v13

    .line 545
    move v14, v3

    .line 546
    :goto_b
    if-ge v14, v13, :cond_1e

    .line 547
    .line 548
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v15

    .line 552
    add-int/lit8 v14, v14, 0x1

    .line 553
    .line 554
    check-cast v15, Lwq2;

    .line 555
    .line 556
    move/from16 v16, v3

    .line 557
    .line 558
    iget-object v3, v15, Lwq2;->c:Ljava/lang/String;

    .line 559
    .line 560
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-eqz v3, :cond_1d

    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_1d
    move/from16 v3, v16

    .line 568
    .line 569
    goto :goto_b

    .line 570
    :cond_1e
    move/from16 v16, v3

    .line 571
    .line 572
    move-object v15, v9

    .line 573
    :goto_c
    if-eqz v15, :cond_1f

    .line 574
    .line 575
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    if-nez v4, :cond_1f

    .line 579
    .line 580
    iget-object v3, v0, Lwq2;->v:Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v3

    .line 586
    if-nez v3, :cond_1f

    .line 587
    .line 588
    move v4, v6

    .line 589
    :cond_1f
    move/from16 v3, v16

    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_20
    if-eqz v4, :cond_21

    .line 593
    .line 594
    iput-object v2, v0, Lwq2;->v:Ljava/util/ArrayList;

    .line 595
    .line 596
    or-int/lit8 v0, v11, 0x1

    .line 597
    .line 598
    return v0

    .line 599
    :cond_21
    return v11

    .line 600
    :cond_22
    move/from16 v16, v3

    .line 601
    .line 602
    return v16
.end method

.method public final j(I)V
    .locals 3

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lyq2;->c()Lui1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lwq2;->q:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {v0, p0}, Lui1;->f(Lwq2;)Loq2;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Loq2;->f(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final k(Z)V
    .locals 2

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lyq2;->c()Lui1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-virtual {v0, p0, v1, p1}, Lui1;->i(Lwq2;IZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lwq2;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :cond_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, Landroid/content/IntentFilter;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Landroid/content/IntentFilter;->hasCategory(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_1
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MediaRouter.RouteInfo{ uniqueId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lwq2;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", name="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lwq2;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", description="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lwq2;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconUri="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lwq2;->f:Landroid/net/Uri;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", enabled="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, Lwq2;->g:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", isSystemRoute="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, Lwq2;->h:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", connectionState="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lwq2;->i:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", canDisconnect="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, Lwq2;->j:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", playbackType="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p0, Lwq2;->l:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", playbackStream="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget v1, p0, Lwq2;->m:I

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", deviceType="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget v1, p0, Lwq2;->n:I

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", volumeHandling="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget v1, p0, Lwq2;->o:I

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", volume="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget v1, p0, Lwq2;->p:I

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", volumeMax="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget v1, p0, Lwq2;->q:I

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", presentationDisplayId="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget v1, p0, Lwq2;->r:I

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, ", extras="

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lwq2;->s:Landroid/os/Bundle;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v1, ", settingsIntent="

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lwq2;->t:Landroid/content/IntentSender;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, ", providerPackageName="

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Lwq2;->a:Lvq2;

    .line 179
    .line 180
    iget-object v1, v1, Lvq2;->d:Lom1;

    .line 181
    .line 182
    iget-object v1, v1, Lom1;->o:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Landroid/content/ComponentName;

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lwq2;->e()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_3

    .line 198
    .line 199
    const-string v1, ", members=["

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    iget-object v1, p0, Lwq2;->v:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    const/4 v2, 0x0

    .line 211
    :goto_0
    if-ge v2, v1, :cond_2

    .line 212
    .line 213
    if-lez v2, :cond_0

    .line 214
    .line 215
    const-string v3, ", "

    .line 216
    .line 217
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    :cond_0
    iget-object v3, p0, Lwq2;->v:Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-eq v3, p0, :cond_1

    .line 227
    .line 228
    iget-object v3, p0, Lwq2;->v:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    check-cast v3, Lwq2;

    .line 235
    .line 236
    iget-object v3, v3, Lwq2;->c:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_2
    const/16 p0, 0x5d

    .line 245
    .line 246
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    :cond_3
    const-string p0, " }"

    .line 250
    .line 251
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0
.end method
