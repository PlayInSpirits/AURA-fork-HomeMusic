.class public abstract Ldefpackage/ud3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/f01;

.field public static final b:Ljava/lang/Object;

.field public static final c:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/f01;

    .line 2
    .line 3
    const-string v1, "CLOSED"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldefpackage/ud3;->a:Ldefpackage/f01;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ldefpackage/ud3;->b:Ljava/lang/Object;

    .line 17
    .line 18
    const/16 v0, 0x1d

    .line 19
    .line 20
    new-array v0, v0, [I

    .line 21
    .line 22
    fill-array-data v0, :array_0

    .line 23
    .line 24
    .line 25
    sput-object v0, Ldefpackage/ud3;->c:[I

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.8909645E8f
        0x4d344120    # 1.8901043E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
.end method

.method public static A()Ljava/util/Map;
    .locals 3

    .line 1
    const-string v0, "resume_points"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    :try_start_0
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Ldefpackage/nk1;

    .line 18
    .line 19
    invoke-direct {v1}, Ldefpackage/nk1;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lcom/eddyizm/tempus/util/Preferences$getResumePoints$1;

    .line 23
    .line 24
    invoke-direct {v2}, Lcom/eddyizm/tempus/util/Preferences$getResumePoints$1;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v0, v2}, Ldefpackage/nk1;->f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/util/Map;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v0

    .line 45
    :cond_2
    :goto_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :catch_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public static final A0(Z)V
    .locals 1

    .line 1
    const-string v0, "sync_starred_tracks_for_offline_use"

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final B()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "salt"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final B0(I)V
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
    const-string v1, "streaming_cache_storage"

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final C()I
    .locals 3

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
    const-string v1, "selected_equalizer"

    .line 13
    .line 14
    const-string v2, "0"

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public static final C0(Ljava/lang/String;)V
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
    const-string v1, "token"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final D()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "server"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final D0(Ljava/lang/String;)V
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
    const-string v1, "user"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final E()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "server_id"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static E0(Landroid/view/View;Lcom/eddyizm/tempus/homemusic/HubMixToday;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getMix()Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v2, v1

    .line 14
    :goto_0
    const v3, 0x7f0a02db

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Landroid/widget/TextView;

    .line 22
    .line 23
    const v4, 0x7f1301ed

    .line 24
    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTitle()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    invoke-static {v5}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-nez v6, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v5, v1

    .line 42
    :goto_1
    if-eqz v5, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    const v0, 0x7f0a02da

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getMix()Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move-object v5, v1

    .line 76
    :goto_3
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_4
    if-eqz v5, :cond_6

    .line 87
    .line 88
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTitle()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eqz v4, :cond_5

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    move-object p1, v1

    .line 100
    :goto_4
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTotal()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTotal()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const v6, 0x7f120006

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v6, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    filled-new-array {p1, v3}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Ldefpackage/ti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const/4 v7, 0x0

    .line 132
    const/16 v8, 0x3e

    .line 133
    .line 134
    const-string v4, " \u00b7 "

    .line 135
    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    invoke-static/range {v3 .. v8}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getBuilding()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_7

    .line 148
    .line 149
    const p1, 0x7f1301e9

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_7
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getOnboarding()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    const p1, 0x7f1301eb

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_8
    const p1, 0x7f1301ea

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    :goto_5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    const p1, 0x7f0a02d9

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-eqz v2, :cond_9

    .line 198
    .line 199
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTracks()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    :cond_9
    if-eqz v1, :cond_b

    .line 204
    .line 205
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_a

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_a
    const/4 p1, 0x0

    .line 213
    goto :goto_7

    .line 214
    :cond_b
    :goto_6
    const/16 p1, 0x8

    .line 215
    .line 216
    :goto_7
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    return-void
.end method

.method public static final F()J
    .locals 3

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
    const-string v1, "streaming_cache_size"

    .line 13
    .line 14
    const-string v2, "256"

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0
.end method

.method public static F0(Ldefpackage/l51;ZZ)Ldefpackage/th4;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/l51;->getLength()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide/16 v4, -0x1

    .line 10
    .line 11
    cmp-long v6, v2, v4

    .line 12
    .line 13
    const-wide/16 v7, 0x1000

    .line 14
    .line 15
    if-eqz v6, :cond_1

    .line 16
    .line 17
    cmp-long v9, v2, v7

    .line 18
    .line 19
    if-lez v9, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v7, v2

    .line 23
    :cond_1
    :goto_0
    long-to-int v7, v7

    .line 24
    new-instance v8, Ldefpackage/be3;

    .line 25
    .line 26
    const/16 v9, 0x40

    .line 27
    .line 28
    invoke-direct {v8, v9}, Ldefpackage/be3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    move v10, v9

    .line 33
    move v11, v10

    .line 34
    :goto_1
    if-ge v10, v7, :cond_2

    .line 35
    .line 36
    const/16 v13, 0x8

    .line 37
    .line 38
    invoke-virtual {v8, v13}, Ldefpackage/be3;->K(I)V

    .line 39
    .line 40
    .line 41
    iget-object v14, v8, Ldefpackage/be3;->a:[B

    .line 42
    .line 43
    const/4 v15, 0x1

    .line 44
    invoke-interface {v0, v14, v9, v13, v15}, Ldefpackage/l51;->e([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    if-nez v14, :cond_3

    .line 49
    .line 50
    :cond_2
    move v5, v9

    .line 51
    const/16 v21, 0x0

    .line 52
    .line 53
    goto/16 :goto_a

    .line 54
    .line 55
    :cond_3
    invoke-virtual {v8}, Ldefpackage/be3;->C()J

    .line 56
    .line 57
    .line 58
    move-result-wide v16

    .line 59
    invoke-virtual {v8}, Ldefpackage/be3;->m()I

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    const-wide/16 v18, 0x1

    .line 64
    .line 65
    cmp-long v18, v16, v18

    .line 66
    .line 67
    if-nez v18, :cond_4

    .line 68
    .line 69
    move-wide/from16 v18, v4

    .line 70
    .line 71
    iget-object v4, v8, Ldefpackage/be3;->a:[B

    .line 72
    .line 73
    invoke-interface {v0, v4, v13, v13}, Ldefpackage/l51;->n([BII)V

    .line 74
    .line 75
    .line 76
    const/16 v4, 0x10

    .line 77
    .line 78
    invoke-virtual {v8, v4}, Ldefpackage/be3;->M(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8}, Ldefpackage/be3;->u()J

    .line 82
    .line 83
    .line 84
    move-result-wide v16

    .line 85
    move-wide/from16 v24, v16

    .line 86
    .line 87
    move/from16 v16, v10

    .line 88
    .line 89
    move-wide/from16 v9, v24

    .line 90
    .line 91
    move/from16 v17, v6

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    move-wide/from16 v18, v4

    .line 95
    .line 96
    const-wide/16 v4, 0x0

    .line 97
    .line 98
    cmp-long v4, v16, v4

    .line 99
    .line 100
    if-nez v4, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ldefpackage/l51;->getLength()J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    cmp-long v20, v4, v18

    .line 107
    .line 108
    if-eqz v20, :cond_5

    .line 109
    .line 110
    invoke-interface {v0}, Ldefpackage/l51;->f()J

    .line 111
    .line 112
    .line 113
    move-result-wide v16

    .line 114
    sub-long v4, v4, v16

    .line 115
    .line 116
    const-wide/16 v16, 0x8

    .line 117
    .line 118
    add-long v16, v4, v16

    .line 119
    .line 120
    :cond_5
    move-wide/from16 v24, v16

    .line 121
    .line 122
    move/from16 v16, v10

    .line 123
    .line 124
    move-wide/from16 v9, v24

    .line 125
    .line 126
    move/from16 v17, v6

    .line 127
    .line 128
    move v4, v13

    .line 129
    :goto_2
    int-to-long v5, v4

    .line 130
    cmp-long v21, v9, v5

    .line 131
    .line 132
    if-gez v21, :cond_7

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    const v12, 0x66726565

    .line 137
    .line 138
    .line 139
    if-ne v14, v12, :cond_6

    .line 140
    .line 141
    if-ne v4, v13, :cond_6

    .line 142
    .line 143
    move-wide v9, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    new-instance v0, Ldefpackage/dl;

    .line 146
    .line 147
    invoke-direct {v0, v14, v4, v9, v10}, Ldefpackage/dl;-><init>(IIJ)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_7
    const/16 v21, 0x0

    .line 152
    .line 153
    :goto_3
    add-int v4, v16, v4

    .line 154
    .line 155
    const v12, 0x6d6f6f76

    .line 156
    .line 157
    .line 158
    if-ne v14, v12, :cond_9

    .line 159
    .line 160
    long-to-int v5, v9

    .line 161
    add-int/2addr v7, v5

    .line 162
    if-eqz v17, :cond_8

    .line 163
    .line 164
    int-to-long v5, v7

    .line 165
    cmp-long v5, v5, v2

    .line 166
    .line 167
    if-lez v5, :cond_8

    .line 168
    .line 169
    long-to-int v7, v2

    .line 170
    :cond_8
    move v10, v4

    .line 171
    move/from16 v6, v17

    .line 172
    .line 173
    move-wide/from16 v4, v18

    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :cond_9
    const v12, 0x7472616b

    .line 179
    .line 180
    .line 181
    if-eq v14, v12, :cond_a

    .line 182
    .line 183
    const v12, 0x6d646961

    .line 184
    .line 185
    .line 186
    if-eq v14, v12, :cond_a

    .line 187
    .line 188
    const v12, 0x6d696e66

    .line 189
    .line 190
    .line 191
    if-ne v14, v12, :cond_b

    .line 192
    .line 193
    :cond_a
    move-wide/from16 v22, v2

    .line 194
    .line 195
    const/4 v5, 0x0

    .line 196
    goto/16 :goto_9

    .line 197
    .line 198
    :cond_b
    const v12, 0x6d6f6f66

    .line 199
    .line 200
    .line 201
    if-eq v14, v12, :cond_18

    .line 202
    .line 203
    const v12, 0x6d766578

    .line 204
    .line 205
    .line 206
    if-ne v14, v12, :cond_c

    .line 207
    .line 208
    goto/16 :goto_8

    .line 209
    .line 210
    :cond_c
    const v12, 0x6d646174

    .line 211
    .line 212
    .line 213
    if-ne v14, v12, :cond_d

    .line 214
    .line 215
    move v11, v15

    .line 216
    :cond_d
    const v12, 0x7374626c

    .line 217
    .line 218
    .line 219
    if-ne v14, v12, :cond_e

    .line 220
    .line 221
    const-wide/32 v22, 0xf4240

    .line 222
    .line 223
    .line 224
    cmp-long v12, v9, v22

    .line 225
    .line 226
    if-lez v12, :cond_e

    .line 227
    .line 228
    :goto_4
    const/4 v9, 0x0

    .line 229
    goto/16 :goto_b

    .line 230
    .line 231
    :cond_e
    move v12, v14

    .line 232
    int-to-long v13, v4

    .line 233
    add-long/2addr v13, v9

    .line 234
    sub-long/2addr v13, v5

    .line 235
    move-wide/from16 v22, v2

    .line 236
    .line 237
    int-to-long v2, v7

    .line 238
    cmp-long v2, v13, v2

    .line 239
    .line 240
    if-ltz v2, :cond_f

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_f
    sub-long/2addr v9, v5

    .line 244
    long-to-int v2, v9

    .line 245
    add-int v10, v4, v2

    .line 246
    .line 247
    const v3, 0x66747970

    .line 248
    .line 249
    .line 250
    if-ne v12, v3, :cond_16

    .line 251
    .line 252
    const/16 v3, 0x8

    .line 253
    .line 254
    if-ge v2, v3, :cond_10

    .line 255
    .line 256
    new-instance v0, Ldefpackage/dl;

    .line 257
    .line 258
    int-to-long v1, v2

    .line 259
    invoke-direct {v0, v12, v3, v1, v2}, Ldefpackage/dl;-><init>(IIJ)V

    .line 260
    .line 261
    .line 262
    return-object v0

    .line 263
    :cond_10
    invoke-virtual {v8, v2}, Ldefpackage/be3;->K(I)V

    .line 264
    .line 265
    .line 266
    iget-object v3, v8, Ldefpackage/be3;->a:[B

    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    invoke-interface {v0, v3, v5, v2}, Ldefpackage/l51;->n([BII)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v8}, Ldefpackage/be3;->m()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    invoke-static {v2, v1}, Ldefpackage/ud3;->P(IZ)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_11

    .line 281
    .line 282
    move v11, v15

    .line 283
    :cond_11
    const/4 v3, 0x4

    .line 284
    invoke-virtual {v8, v3}, Ldefpackage/be3;->O(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v8}, Ldefpackage/be3;->a()I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    div-int/2addr v4, v3

    .line 292
    if-nez v11, :cond_14

    .line 293
    .line 294
    if-lez v4, :cond_14

    .line 295
    .line 296
    new-array v12, v4, [I

    .line 297
    .line 298
    move v3, v5

    .line 299
    :goto_5
    if-ge v3, v4, :cond_13

    .line 300
    .line 301
    invoke-virtual {v8}, Ldefpackage/be3;->m()I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    aput v6, v12, v3

    .line 306
    .line 307
    invoke-static {v6, v1}, Ldefpackage/ud3;->P(IZ)Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-eqz v6, :cond_12

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_12
    add-int/lit8 v3, v3, 0x1

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_13
    move v15, v11

    .line 318
    goto :goto_6

    .line 319
    :cond_14
    move v15, v11

    .line 320
    move-object/from16 v12, v21

    .line 321
    .line 322
    :goto_6
    if-nez v15, :cond_15

    .line 323
    .line 324
    new-instance v0, Ldefpackage/x7;

    .line 325
    .line 326
    invoke-direct {v0, v12, v2}, Ldefpackage/x7;-><init>([II)V

    .line 327
    .line 328
    .line 329
    return-object v0

    .line 330
    :cond_15
    move v11, v15

    .line 331
    goto :goto_7

    .line 332
    :cond_16
    const/4 v5, 0x0

    .line 333
    if-eqz v2, :cond_17

    .line 334
    .line 335
    invoke-interface {v0, v2}, Ldefpackage/l51;->g(I)V

    .line 336
    .line 337
    .line 338
    :cond_17
    :goto_7
    move v9, v5

    .line 339
    move/from16 v6, v17

    .line 340
    .line 341
    move-wide/from16 v4, v18

    .line 342
    .line 343
    move-wide/from16 v2, v22

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :cond_18
    :goto_8
    move v9, v15

    .line 348
    goto :goto_b

    .line 349
    :goto_9
    move v10, v4

    .line 350
    goto :goto_7

    .line 351
    :goto_a
    move v9, v5

    .line 352
    :goto_b
    if-nez v11, :cond_19

    .line 353
    .line 354
    sget-object v0, Ldefpackage/rv2;->t:Ldefpackage/rv2;

    .line 355
    .line 356
    return-object v0

    .line 357
    :cond_19
    move/from16 v0, p1

    .line 358
    .line 359
    if-eq v0, v9, :cond_1b

    .line 360
    .line 361
    if-eqz v9, :cond_1a

    .line 362
    .line 363
    sget-object v0, Ldefpackage/ox1;->p:Ldefpackage/ox1;

    .line 364
    .line 365
    return-object v0

    .line 366
    :cond_1a
    sget-object v0, Ldefpackage/ox1;->q:Ldefpackage/ox1;

    .line 367
    .line 368
    return-object v0

    .line 369
    :cond_1b
    return-object v21
.end method

.method public static final G()I
    .locals 3

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
    const-string v1, "streaming_cache_storage"

    .line 13
    .line 14
    const-string v2, "0"

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public static G0(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ldefpackage/r50;->v(Landroid/content/Context;Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final H()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "theme"

    .line 2
    .line 3
    const-string v1, "default"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    return-object v0
.end method

.method public static final H0()V
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/ud3;->u()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ldefpackage/ud3;->v()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "in_use_server_address"

    .line 40
    .line 41
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final I()I
    .locals 5

    .line 1
    const-string v0, "tile_size"

    .line 2
    .line 3
    const-string v1, "2"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Ldefpackage/xm4;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    const/4 v2, 0x2

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-gt v2, v3, :cond_1

    .line 26
    .line 27
    const/4 v4, 0x7

    .line 28
    if-ge v3, v4, :cond_1

    .line 29
    .line 30
    move-object v1, v0

    .line 31
    :cond_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0

    .line 38
    :cond_2
    return v2
.end method

.method public static I0(J)Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p0, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p0, v2

    .line 16
    long-to-int p0, p0

    .line 17
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    cmpg-float p1, v1, p1

    .line 22
    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ldefpackage/gh0;->F(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "CornerRadius.circular("

    .line 36
    .line 37
    invoke-static {p1, p0, v1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p1}, Ldefpackage/gh0;->F(F)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {p0}, Ldefpackage/gh0;->F(F)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "CornerRadius.elliptical("

    .line 59
    .line 60
    const-string v2, ", "

    .line 61
    .line 62
    invoke-static {v0, p1, v2, p0, v1}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public static final J()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final J0(Ldefpackage/ne0;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/wf1;Ldefpackage/vd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p0, p2}, Ldefpackage/te5;->R(Ldefpackage/ne0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    new-instance v0, Ldefpackage/lk4;

    .line 6
    .line 7
    invoke-direct {v0, p4, p0}, Ldefpackage/lk4;-><init>(Ldefpackage/vd0;Ldefpackage/ne0;)V

    .line 8
    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    invoke-static {p3, p1, v0}, Ldefpackage/ya4;->Q(Ldefpackage/wf1;Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v1, 0x2

    .line 20
    invoke-static {v1, p3}, Ldefpackage/jz4;->j(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p3, p1, v0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :goto_0
    invoke-static {p0, p2}, Ldefpackage/te5;->K(Ldefpackage/ne0;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 31
    .line 32
    if-ne p1, p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    :cond_1
    return-object p1

    .line 38
    :goto_1
    invoke-static {p0, p2}, Ldefpackage/te5;->K(Ldefpackage/ne0;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public static final K()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/ud3;->R0(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Ldefpackage/ud3;->S0(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static L(Landroid/os/Bundle;)Ldefpackage/u45;
    .locals 1

    .line 1
    const-string v0, "android.support.v4.media.session.SESSION_TOKEN2"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/Bundle;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class v0, Ldefpackage/ud3;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "a"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of v0, p0, Landroidx/versionedparcelable/ParcelImpl;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    check-cast p0, Landroidx/versionedparcelable/ParcelImpl;

    .line 32
    .line 33
    iget-object p0, p0, Landroidx/versionedparcelable/ParcelImpl;->n:Ldefpackage/u45;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string v0, "Invalid parcel"

    .line 39
    .line 40
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :catch_0
    :goto_0
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static L0(Landroid/os/Parcel;I[B)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/ud3;->R0(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Ldefpackage/ud3;->S0(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static M(Ldefpackage/nc1;Ljava/lang/String;Ldefpackage/jj1;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    new-instance v1, Ldefpackage/uh1;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ldefpackage/uh1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v4, Ldefpackage/kh1;

    .line 18
    .line 19
    invoke-static {v0}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v4, p1}, Ldefpackage/kh1;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Landroid/os/CancellationSignal;

    .line 27
    .line 28
    invoke-direct {v5}, Landroid/os/CancellationSignal;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Ldefpackage/ud3;->w(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v7, Ldefpackage/wo0;

    .line 39
    .line 40
    invoke-direct {v7, p2, p0}, Ldefpackage/wo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance p2, Ldefpackage/zg5;

    .line 44
    .line 45
    invoke-direct {p2, p0}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL"

    .line 49
    .line 50
    if-eq v4, v0, :cond_4

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ldefpackage/xf0;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 70
    .line 71
    const/16 v0, 0x22

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    if-lt p1, v0, :cond_3

    .line 75
    .line 76
    new-instance p1, Ldefpackage/bg0;

    .line 77
    .line 78
    iget-object v0, p2, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Ldefpackage/nc1;

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ldefpackage/bg0;-><init>(Ldefpackage/nc1;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ldefpackage/bg0;->isAvailableOnDevice()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    move-object v1, p1

    .line 92
    :cond_1
    if-nez v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p2}, Ldefpackage/zg5;->D()Ldefpackage/yf0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_2
    :goto_1
    move-object v2, v1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    const/16 v0, 0x21

    .line 101
    .line 102
    if-gt p1, v0, :cond_2

    .line 103
    .line 104
    invoke-virtual {p2}, Ldefpackage/zg5;->D()Ldefpackage/yf0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-virtual {p2}, Ldefpackage/zg5;->D()Ldefpackage/yf0;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    goto :goto_1

    .line 114
    :goto_2
    if-nez v2, :cond_5

    .line 115
    .line 116
    new-instance p0, Landroidx/credentials/exceptions/GetCredentialProviderConfigurationException;

    .line 117
    .line 118
    const-string p1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"

    .line 119
    .line 120
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialProviderConfigurationException;-><init>(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, p0}, Ldefpackage/wo0;->F(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_5
    move-object v3, p0

    .line 128
    invoke-interface/range {v2 .. v7}, Ldefpackage/yf0;->onGetCredential(Landroid/content/Context;Ldefpackage/kh1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ldefpackage/vf0;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static M0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/ud3;->R0(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-interface {p2, p0, p3}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Ldefpackage/ud3;->S0(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static N(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    if-eq p0, v0, :cond_7

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eq p0, v1, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-eq p0, v2, :cond_5

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    if-eq p0, v0, :cond_4

    .line 21
    .line 22
    const/16 v0, 0x40

    .line 23
    .line 24
    if-eq p0, v0, :cond_3

    .line 25
    .line 26
    const/16 v0, 0x80

    .line 27
    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x100

    .line 31
    .line 32
    if-eq p0, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x200

    .line 35
    .line 36
    if-ne p0, v0, :cond_0

    .line 37
    .line 38
    const/16 p0, 0x9

    .line 39
    .line 40
    return p0

    .line 41
    :cond_0
    const-string v0, "type needs to be >= FIRST and <= LAST, type="

    .line 42
    .line 43
    invoke-static {p0, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_1
    return v1

    .line 53
    :cond_2
    const/4 p0, 0x7

    .line 54
    return p0

    .line 55
    :cond_3
    const/4 p0, 0x6

    .line 56
    return p0

    .line 57
    :cond_4
    const/4 p0, 0x5

    .line 58
    return p0

    .line 59
    :cond_5
    return v0

    .line 60
    :cond_6
    const/4 p0, 0x3

    .line 61
    return p0

    .line 62
    :cond_7
    return v1

    .line 63
    :cond_8
    return v0

    .line 64
    :cond_9
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static N0(Ljava/util/Map;)V
    .locals 6

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
    new-instance v1, Ldefpackage/nk1;

    .line 17
    .line 18
    invoke-direct {v1}, Ldefpackage/nk1;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/16 v3, 0xc8

    .line 26
    .line 27
    if-gt v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Iterable;

    .line 35
    .line 36
    new-instance v4, Ldefpackage/jb2;

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    invoke-direct {v4, v5}, Ldefpackage/jb2;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v4}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2, v3}, Ldefpackage/q40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/util/Map$Entry;

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    :goto_1
    invoke-virtual {v1, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v1, "resume_points"

    .line 86
    .line 87
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static final O()Z
    .locals 4

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
    const-string v1, "auto_download_lyrics"

    .line 13
    .line 14
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

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
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    return v3
.end method

.method public static O0(Landroid/os/Parcel;ILjava/lang/String;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/ud3;->R0(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Ldefpackage/ud3;->S0(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static P(IZ)Z
    .locals 3

    .line 1
    ushr-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    const v1, 0x336770

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    const v0, 0x68656963

    .line 11
    .line 12
    .line 13
    if-ne p0, v0, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    move v0, p1

    .line 20
    :goto_0
    const/16 v1, 0x1d

    .line 21
    .line 22
    if-ge v0, v1, :cond_3

    .line 23
    .line 24
    sget-object v1, Ldefpackage/ud3;->c:[I

    .line 25
    .line 26
    aget v1, v1, v0

    .line 27
    .line 28
    if-ne v1, p0, :cond_2

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    return p1
.end method

.method public static P0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/ud3;->R0(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    array-length v0, p2

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    aget-object v3, p2, v2

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-virtual {p0, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-interface {v3, p0, p3}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 44
    .line 45
    .line 46
    sub-int v4, v3, v5

    .line 47
    .line 48
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {p0, p1}, Ldefpackage/ud3;->S0(Landroid/os/Parcel;I)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static final Q()Z
    .locals 2

    .line 1
    const-string v0, "dark_theme_black"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static Q0(Landroid/os/Parcel;ILjava/util/List;)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/ud3;->R0(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v2, v0, :cond_2

    .line 18
    .line 19
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroid/os/Parcelable;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-virtual {p0, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-interface {v3, p0, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 51
    .line 52
    .line 53
    sub-int v4, v3, v5

    .line 54
    .line 55
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 59
    .line 60
    .line 61
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {p0, p1}, Ldefpackage/ud3;->S0(Landroid/os/Parcel;I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final R()Z
    .locals 2

    .line 1
    const-string v0, "data_saving_mode"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static R0(Landroid/os/Parcel;I)I
    .locals 1

    .line 1
    const/high16 v0, -0x10000

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final S()Z
    .locals 2

    .line 1
    const-string v0, "dynamic_color_accent"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static S0(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int v1, v0, p1

    .line 6
    .line 7
    add-int/lit8 p1, p1, -0x4

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final T()Z
    .locals 4

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
    const-string v1, "last_instant_mix"

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v2, 0x2710

    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-gez v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public static T0(Landroid/os/Parcel;II)V
    .locals 0

    .line 1
    shl-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    or-int/2addr p1, p2

    .line 4
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final U()Z
    .locals 2

    .line 1
    const-string v0, "audio_transcode_priority"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static final V()Z
    .locals 2

    .line 1
    const-string v0, "share"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static final W()Z
    .locals 2

    .line 1
    const-string v0, "sync_starred_artists_for_offline_use"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static final X()Z
    .locals 2

    .line 1
    const-string v0, "sync_starred_tracks_for_offline_use"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static final Y()Z
    .locals 2

    .line 1
    const-string v0, "queue_syncing"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static Z(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ldefpackage/fb2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldefpackage/fb2;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {v0}, Ldefpackage/fb2;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ldefpackage/fb2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    move-object v2, p0

    .line 18
    check-cast v2, Ljava/lang/String;

    .line 19
    .line 20
    const-string v3, "LOCATION:"

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-static {v2, v3, v4}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, v1

    .line 31
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    const/16 v0, 0x3a

    .line 36
    .line 37
    invoke-static {p0, v0}, Ldefpackage/qm4;->E0(Ljava/lang/String;C)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-lez v0, :cond_2

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    return-object v1
.end method

.method public static final a(Ldefpackage/pu0;J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 2
    .line 3
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 13
    .line 14
    iget-object v0, v0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ldefpackage/iz1;

    .line 17
    .line 18
    iget-object v1, v0, Ldefpackage/iz1;->n0:Ldefpackage/sq4;

    .line 19
    .line 20
    iget-boolean v1, v1, Ldefpackage/cx2;->A:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ldefpackage/f63;->K0(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const/16 v2, 0x20

    .line 32
    .line 33
    shr-long v3, v0, v2

    .line 34
    .line 35
    long-to-int v3, v3

    .line 36
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const-wide v4, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v0, v4

    .line 46
    long-to-int v0, v0

    .line 47
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-wide v6, p0, Ldefpackage/pu0;->D:J

    .line 52
    .line 53
    shr-long v8, v6, v2

    .line 54
    .line 55
    long-to-int p0, v8

    .line 56
    int-to-float p0, p0

    .line 57
    add-float/2addr p0, v3

    .line 58
    and-long/2addr v6, v4

    .line 59
    long-to-int v1, v6

    .line 60
    int-to-float v1, v1

    .line 61
    add-float/2addr v1, v0

    .line 62
    shr-long v6, p1, v2

    .line 63
    .line 64
    long-to-int v2, v6

    .line 65
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    cmpg-float v3, v3, v2

    .line 70
    .line 71
    if-gtz v3, :cond_2

    .line 72
    .line 73
    cmpg-float p0, v2, p0

    .line 74
    .line 75
    if-gtz p0, :cond_2

    .line 76
    .line 77
    and-long p0, p1, v4

    .line 78
    .line 79
    long-to-int p0, p0

    .line 80
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    cmpg-float p1, v0, p0

    .line 85
    .line 86
    if-gtz p1, :cond_2

    .line 87
    .line 88
    cmpg-float p0, p0, v1

    .line 89
    .line 90
    if-gtz p0, :cond_2

    .line 91
    .line 92
    const/4 p0, 0x1

    .line 93
    return p0

    .line 94
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 95
    return p0
.end method

.method public static a0([D[[D)[D
    .locals 17

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-wide v1, p0, v0

    .line 3
    .line 4
    aget-object v3, p1, v0

    .line 5
    .line 6
    aget-wide v4, v3, v0

    .line 7
    .line 8
    mul-double/2addr v4, v1

    .line 9
    const/4 v6, 0x1

    .line 10
    aget-wide v7, p0, v6

    .line 11
    .line 12
    aget-wide v9, v3, v6

    .line 13
    .line 14
    mul-double/2addr v9, v7

    .line 15
    add-double/2addr v9, v4

    .line 16
    const/4 v4, 0x2

    .line 17
    aget-wide v11, p0, v4

    .line 18
    .line 19
    aget-wide v13, v3, v4

    .line 20
    .line 21
    mul-double/2addr v13, v11

    .line 22
    add-double/2addr v13, v9

    .line 23
    aget-object v3, p1, v6

    .line 24
    .line 25
    aget-wide v9, v3, v0

    .line 26
    .line 27
    mul-double/2addr v9, v1

    .line 28
    aget-wide v15, v3, v6

    .line 29
    .line 30
    mul-double/2addr v15, v7

    .line 31
    add-double/2addr v15, v9

    .line 32
    aget-wide v9, v3, v4

    .line 33
    .line 34
    mul-double/2addr v9, v11

    .line 35
    add-double/2addr v9, v15

    .line 36
    aget-object v3, p1, v4

    .line 37
    .line 38
    aget-wide v15, v3, v0

    .line 39
    .line 40
    mul-double/2addr v1, v15

    .line 41
    aget-wide v15, v3, v6

    .line 42
    .line 43
    mul-double/2addr v7, v15

    .line 44
    add-double/2addr v7, v1

    .line 45
    aget-wide v1, v3, v4

    .line 46
    .line 47
    mul-double/2addr v11, v1

    .line 48
    add-double/2addr v11, v7

    .line 49
    const/4 v1, 0x3

    .line 50
    new-array v1, v1, [D

    .line 51
    .line 52
    aput-wide v13, v1, v0

    .line 53
    .line 54
    aput-wide v9, v1, v6

    .line 55
    .line 56
    aput-wide v11, v1, v4

    .line 57
    .line 58
    return-object v1
.end method

.method public static b(JLdefpackage/tv;ILjava/util/ArrayList;IILjava/util/ArrayList;)V
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v2, p5

    .line 8
    .line 9
    move/from16 v10, p6

    .line 10
    .line 11
    move-object/from16 v8, p7

    .line 12
    .line 13
    const-string v3, "Failed requirement."

    .line 14
    .line 15
    if-ge v2, v10, :cond_11

    .line 16
    .line 17
    move v4, v2

    .line 18
    :goto_0
    if-ge v4, v10, :cond_1

    .line 19
    .line 20
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Ldefpackage/yw;

    .line 25
    .line 26
    invoke-virtual {v6}, Ldefpackage/yw;->d()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-lt v6, v1, :cond_0

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v3}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual/range {p4 .. p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ldefpackage/yw;

    .line 44
    .line 45
    add-int/lit8 v4, v10, -0x1

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ldefpackage/yw;

    .line 52
    .line 53
    invoke-virtual {v3}, Ldefpackage/yw;->d()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-ne v1, v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ldefpackage/yw;

    .line 76
    .line 77
    move-object/from16 v19, v6

    .line 78
    .line 79
    move v6, v2

    .line 80
    move v2, v3

    .line 81
    move-object/from16 v3, v19

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move v6, v2

    .line 85
    const/4 v2, -0x1

    .line 86
    :goto_1
    invoke-virtual {v3, v1}, Ldefpackage/yw;->i(I)B

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-virtual {v4, v1}, Ldefpackage/yw;->i(I)B

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    const-wide/16 v14, 0x2

    .line 95
    .line 96
    if-eq v7, v9, :cond_c

    .line 97
    .line 98
    add-int/lit8 v3, v6, 0x1

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    :goto_2
    if-ge v3, v10, :cond_4

    .line 102
    .line 103
    add-int/lit8 v7, v3, -0x1

    .line 104
    .line 105
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    check-cast v7, Ldefpackage/yw;

    .line 110
    .line 111
    invoke-virtual {v7, v1}, Ldefpackage/yw;->i(I)B

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    check-cast v9, Ldefpackage/yw;

    .line 120
    .line 121
    invoke-virtual {v9, v1}, Ldefpackage/yw;->i(I)B

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eq v7, v9, :cond_3

    .line 126
    .line 127
    add-int/lit8 v4, v4, 0x1

    .line 128
    .line 129
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const/16 v16, -0x1

    .line 133
    .line 134
    const-wide/16 v17, 0x4

    .line 135
    .line 136
    iget-wide v11, v0, Ldefpackage/tv;->o:J

    .line 137
    .line 138
    div-long v11, v11, v17

    .line 139
    .line 140
    add-long v11, v11, p0

    .line 141
    .line 142
    add-long/2addr v11, v14

    .line 143
    mul-int/lit8 v3, v4, 0x2

    .line 144
    .line 145
    int-to-long v13, v3

    .line 146
    add-long/2addr v11, v13

    .line 147
    invoke-virtual {v0, v4}, Ldefpackage/tv;->b0(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2}, Ldefpackage/tv;->b0(I)V

    .line 151
    .line 152
    .line 153
    move v2, v6

    .line 154
    :goto_3
    if-ge v2, v10, :cond_7

    .line 155
    .line 156
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ldefpackage/yw;

    .line 161
    .line 162
    invoke-virtual {v3, v1}, Ldefpackage/yw;->i(I)B

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eq v2, v6, :cond_5

    .line 167
    .line 168
    add-int/lit8 v4, v2, -0x1

    .line 169
    .line 170
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Ldefpackage/yw;

    .line 175
    .line 176
    invoke-virtual {v4, v1}, Ldefpackage/yw;->i(I)B

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eq v3, v4, :cond_6

    .line 181
    .line 182
    :cond_5
    and-int/lit16 v3, v3, 0xff

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Ldefpackage/tv;->b0(I)V

    .line 185
    .line 186
    .line 187
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    new-instance v4, Ldefpackage/tv;

    .line 191
    .line 192
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    move v7, v6

    .line 196
    :goto_4
    if-ge v7, v10, :cond_b

    .line 197
    .line 198
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Ldefpackage/yw;

    .line 203
    .line 204
    invoke-virtual {v2, v1}, Ldefpackage/yw;->i(I)B

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    add-int/lit8 v3, v7, 0x1

    .line 209
    .line 210
    move v6, v3

    .line 211
    :goto_5
    if-ge v6, v10, :cond_9

    .line 212
    .line 213
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    check-cast v9, Ldefpackage/yw;

    .line 218
    .line 219
    invoke-virtual {v9, v1}, Ldefpackage/yw;->i(I)B

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    if-eq v2, v9, :cond_8

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_9
    move v6, v10

    .line 230
    :goto_6
    if-ne v3, v6, :cond_a

    .line 231
    .line 232
    add-int/lit8 v2, v1, 0x1

    .line 233
    .line 234
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Ldefpackage/yw;

    .line 239
    .line 240
    invoke-virtual {v3}, Ldefpackage/yw;->d()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-ne v2, v3, :cond_a

    .line 245
    .line 246
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-virtual {v0, v2}, Ldefpackage/tv;->b0(I)V

    .line 257
    .line 258
    .line 259
    move-object v9, v8

    .line 260
    move-wide v2, v11

    .line 261
    move v8, v6

    .line 262
    goto :goto_7

    .line 263
    :cond_a
    iget-wide v2, v4, Ldefpackage/tv;->o:J

    .line 264
    .line 265
    div-long v2, v2, v17

    .line 266
    .line 267
    add-long/2addr v2, v11

    .line 268
    long-to-int v2, v2

    .line 269
    mul-int/lit8 v2, v2, -0x1

    .line 270
    .line 271
    invoke-virtual {v0, v2}, Ldefpackage/tv;->b0(I)V

    .line 272
    .line 273
    .line 274
    add-int/lit8 v5, v1, 0x1

    .line 275
    .line 276
    move-object v9, v8

    .line 277
    move-wide v2, v11

    .line 278
    move v8, v6

    .line 279
    move-object/from16 v6, p4

    .line 280
    .line 281
    invoke-static/range {v2 .. v9}, Ldefpackage/ud3;->b(JLdefpackage/tv;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 282
    .line 283
    .line 284
    move-object v5, v6

    .line 285
    :goto_7
    move-wide v11, v2

    .line 286
    move v7, v8

    .line 287
    move-object v8, v9

    .line 288
    goto :goto_4

    .line 289
    :cond_b
    invoke-virtual {v0, v4}, Ldefpackage/tv;->p(Ldefpackage/ej4;)J

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_c
    move-object v9, v8

    .line 294
    const/16 v16, -0x1

    .line 295
    .line 296
    const-wide/16 v17, 0x4

    .line 297
    .line 298
    invoke-virtual {v3}, Ldefpackage/yw;->d()I

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    invoke-virtual {v4}, Ldefpackage/yw;->d()I

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    const/4 v8, 0x0

    .line 311
    move v11, v1

    .line 312
    :goto_8
    if-ge v11, v7, :cond_d

    .line 313
    .line 314
    invoke-virtual {v3, v11}, Ldefpackage/yw;->i(I)B

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    invoke-virtual {v4, v11}, Ldefpackage/yw;->i(I)B

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    if-ne v12, v13, :cond_d

    .line 323
    .line 324
    add-int/lit8 v8, v8, 0x1

    .line 325
    .line 326
    add-int/lit8 v11, v11, 0x1

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_d
    iget-wide v11, v0, Ldefpackage/tv;->o:J

    .line 330
    .line 331
    div-long v11, v11, v17

    .line 332
    .line 333
    add-long v11, v11, p0

    .line 334
    .line 335
    add-long/2addr v11, v14

    .line 336
    int-to-long v13, v8

    .line 337
    add-long/2addr v11, v13

    .line 338
    const-wide/16 v13, 0x1

    .line 339
    .line 340
    add-long/2addr v11, v13

    .line 341
    neg-int v4, v8

    .line 342
    invoke-virtual {v0, v4}, Ldefpackage/tv;->b0(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v2}, Ldefpackage/tv;->b0(I)V

    .line 346
    .line 347
    .line 348
    add-int v4, v1, v8

    .line 349
    .line 350
    :goto_9
    if-ge v1, v4, :cond_e

    .line 351
    .line 352
    invoke-virtual {v3, v1}, Ldefpackage/yw;->i(I)B

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    and-int/lit16 v2, v2, 0xff

    .line 357
    .line 358
    invoke-virtual {v0, v2}, Ldefpackage/tv;->b0(I)V

    .line 359
    .line 360
    .line 361
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_e
    add-int/lit8 v1, v6, 0x1

    .line 365
    .line 366
    if-ne v1, v10, :cond_10

    .line 367
    .line 368
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Ldefpackage/yw;

    .line 373
    .line 374
    invoke-virtual {v1}, Ldefpackage/yw;->d()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-ne v4, v1, :cond_f

    .line 379
    .line 380
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, Ljava/lang/Number;

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-virtual {v0, v1}, Ldefpackage/tv;->b0(I)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_f
    const-string v0, "Check failed."

    .line 395
    .line 396
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :cond_10
    new-instance v3, Ldefpackage/tv;

    .line 401
    .line 402
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 403
    .line 404
    .line 405
    iget-wide v1, v3, Ldefpackage/tv;->o:J

    .line 406
    .line 407
    div-long v1, v1, v17

    .line 408
    .line 409
    add-long/2addr v1, v11

    .line 410
    long-to-int v1, v1

    .line 411
    mul-int/lit8 v1, v1, -0x1

    .line 412
    .line 413
    invoke-virtual {v0, v1}, Ldefpackage/tv;->b0(I)V

    .line 414
    .line 415
    .line 416
    move-object v8, v9

    .line 417
    move v7, v10

    .line 418
    move-wide v1, v11

    .line 419
    invoke-static/range {v1 .. v8}, Ldefpackage/ud3;->b(JLdefpackage/tv;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v3}, Ldefpackage/tv;->p(Ldefpackage/ej4;)J

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :cond_11
    invoke-static {v3}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    return-void
.end method

.method public static final b0(Ljava/util/Map;Ldefpackage/if1;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ldefpackage/z13;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-boolean v3, v2, Ldefpackage/z13;->b:Z

    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v3, 0x0

    .line 45
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_0

    .line 53
    .line 54
    iget-boolean v2, v2, Ldefpackage/z13;->c:Z

    .line 55
    .line 56
    if-nez v2, :cond_0

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/lang/Iterable;

    .line 75
    .line 76
    new-instance v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    move-object v2, v1

    .line 96
    check-cast v2, Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {p1, v2}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v2, 0x21

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 11
    .line 12
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance p1, Ldefpackage/x63;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Ldefpackage/x63;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p1, Ldefpackage/x63;->b:Landroid/app/NotificationManager;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    return v0

    .line 32
    :cond_0
    const/4 p0, -0x1

    .line 33
    return p0

    .line 34
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_2
    const-string p0, "permission must be non-null"

    .line 48
    .line 49
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return v0
.end method

.method public static c0(Ldefpackage/lg4;ILdefpackage/lg4;ZZZ)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p1}, Ldefpackage/lg4;->u(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int v4, v1, v3

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Ldefpackage/lg4;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {v0, v4}, Ldefpackage/lg4;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    sub-int v7, v6, v5

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    iget-object v10, v0, Ldefpackage/lg4;->b:[I

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Ldefpackage/lg4;->r(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    mul-int/lit8 v11, v11, 0x5

    .line 33
    .line 34
    add-int/2addr v11, v9

    .line 35
    aget v10, v10, v11

    .line 36
    .line 37
    const/high16 v11, 0xc000000

    .line 38
    .line 39
    and-int/2addr v10, v11

    .line 40
    if-eqz v10, :cond_0

    .line 41
    .line 42
    move v10, v9

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v10, 0x0

    .line 45
    :goto_0
    invoke-virtual {v2, v3}, Ldefpackage/lg4;->w(I)V

    .line 46
    .line 47
    .line 48
    iget v11, v2, Ldefpackage/lg4;->t:I

    .line 49
    .line 50
    invoke-virtual {v2, v7, v11}, Ldefpackage/lg4;->x(II)V

    .line 51
    .line 52
    .line 53
    iget v11, v0, Ldefpackage/lg4;->g:I

    .line 54
    .line 55
    if-ge v11, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ldefpackage/lg4;->B(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget v11, v0, Ldefpackage/lg4;->k:I

    .line 61
    .line 62
    if-ge v11, v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v6, v4}, Ldefpackage/lg4;->C(II)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v6, v2, Ldefpackage/lg4;->b:[I

    .line 68
    .line 69
    iget v11, v2, Ldefpackage/lg4;->t:I

    .line 70
    .line 71
    iget-object v12, v0, Ldefpackage/lg4;->b:[I

    .line 72
    .line 73
    mul-int/lit8 v13, v11, 0x5

    .line 74
    .line 75
    mul-int/lit8 v14, v1, 0x5

    .line 76
    .line 77
    mul-int/lit8 v15, v4, 0x5

    .line 78
    .line 79
    invoke-static {v13, v14, v15, v12, v6}, Ldefpackage/ti;->Y(III[I[I)V

    .line 80
    .line 81
    .line 82
    iget-object v12, v2, Ldefpackage/lg4;->c:[Ljava/lang/Object;

    .line 83
    .line 84
    iget v14, v2, Ldefpackage/lg4;->i:I

    .line 85
    .line 86
    iget-object v15, v0, Ldefpackage/lg4;->c:[Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v15, v5, v12, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iget v15, v2, Ldefpackage/lg4;->v:I

    .line 92
    .line 93
    add-int/lit8 v16, v13, 0x2

    .line 94
    .line 95
    aput v15, v6, v16

    .line 96
    .line 97
    sub-int v16, v11, v1

    .line 98
    .line 99
    add-int v8, v11, v3

    .line 100
    .line 101
    invoke-virtual {v2, v6, v11}, Ldefpackage/lg4;->g([II)I

    .line 102
    .line 103
    .line 104
    move-result v18

    .line 105
    sub-int v18, v14, v18

    .line 106
    .line 107
    move/from16 v19, v9

    .line 108
    .line 109
    iget v9, v2, Ldefpackage/lg4;->m:I

    .line 110
    .line 111
    move/from16 v20, v9

    .line 112
    .line 113
    iget v9, v2, Ldefpackage/lg4;->l:I

    .line 114
    .line 115
    array-length v12, v12

    .line 116
    move/from16 v21, v10

    .line 117
    .line 118
    move/from16 v10, v20

    .line 119
    .line 120
    move/from16 v20, v13

    .line 121
    .line 122
    move v13, v11

    .line 123
    :goto_1
    if-ge v13, v8, :cond_6

    .line 124
    .line 125
    if-eq v13, v11, :cond_3

    .line 126
    .line 127
    mul-int/lit8 v22, v13, 0x5

    .line 128
    .line 129
    add-int/lit8 v22, v22, 0x2

    .line 130
    .line 131
    aget v23, v6, v22

    .line 132
    .line 133
    add-int v23, v23, v16

    .line 134
    .line 135
    aput v23, v6, v22

    .line 136
    .line 137
    :cond_3
    invoke-virtual {v2, v6, v13}, Ldefpackage/lg4;->g([II)I

    .line 138
    .line 139
    .line 140
    move-result v22

    .line 141
    move-object/from16 v23, v6

    .line 142
    .line 143
    add-int v6, v22, v18

    .line 144
    .line 145
    if-ge v10, v13, :cond_4

    .line 146
    .line 147
    move/from16 v22, v11

    .line 148
    .line 149
    const/4 v11, 0x0

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move/from16 v22, v11

    .line 152
    .line 153
    iget v11, v2, Ldefpackage/lg4;->k:I

    .line 154
    .line 155
    :goto_2
    invoke-static {v6, v11, v9, v12}, Ldefpackage/lg4;->i(IIII)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    mul-int/lit8 v11, v13, 0x5

    .line 160
    .line 161
    add-int/lit8 v11, v11, 0x4

    .line 162
    .line 163
    aput v6, v23, v11

    .line 164
    .line 165
    if-ne v13, v10, :cond_5

    .line 166
    .line 167
    add-int/lit8 v10, v10, 0x1

    .line 168
    .line 169
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 170
    .line 171
    move/from16 v11, v22

    .line 172
    .line 173
    move-object/from16 v6, v23

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_6
    move-object/from16 v23, v6

    .line 177
    .line 178
    iput v10, v2, Ldefpackage/lg4;->m:I

    .line 179
    .line 180
    iget-object v6, v0, Ldefpackage/lg4;->d:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v0}, Ldefpackage/lg4;->p()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v6, v1, v9}, Ldefpackage/kg4;->a(Ljava/util/ArrayList;II)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    iget-object v9, v0, Ldefpackage/lg4;->d:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v0}, Ldefpackage/lg4;->p()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-static {v9, v4, v10}, Ldefpackage/kg4;->a(Ljava/util/ArrayList;II)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-ge v6, v4, :cond_8

    .line 201
    .line 202
    iget-object v9, v0, Ldefpackage/lg4;->d:Ljava/util/ArrayList;

    .line 203
    .line 204
    new-instance v10, Ljava/util/ArrayList;

    .line 205
    .line 206
    sub-int v11, v4, v6

    .line 207
    .line 208
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    move v11, v6

    .line 212
    :goto_3
    if-ge v11, v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    check-cast v12, Ldefpackage/mg1;

    .line 219
    .line 220
    iget v13, v12, Ldefpackage/mg1;->a:I

    .line 221
    .line 222
    add-int v13, v13, v16

    .line 223
    .line 224
    iput v13, v12, Ldefpackage/mg1;->a:I

    .line 225
    .line 226
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    add-int/lit8 v11, v11, 0x1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_7
    iget-object v11, v2, Ldefpackage/lg4;->d:Ljava/util/ArrayList;

    .line 233
    .line 234
    iget v12, v2, Ldefpackage/lg4;->t:I

    .line 235
    .line 236
    invoke-virtual {v2}, Ldefpackage/lg4;->p()I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    invoke-static {v11, v12, v13}, Ldefpackage/kg4;->a(Ljava/util/ArrayList;II)I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    iget-object v12, v2, Ldefpackage/lg4;->d:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v12, v11, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_8
    sget-object v10, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 258
    .line 259
    :goto_4
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_9

    .line 264
    .line 265
    iget-object v4, v0, Ldefpackage/lg4;->e:Ljava/util/HashMap;

    .line 266
    .line 267
    iget-object v6, v2, Ldefpackage/lg4;->e:Ljava/util/HashMap;

    .line 268
    .line 269
    if-eqz v4, :cond_9

    .line 270
    .line 271
    if-eqz v6, :cond_9

    .line 272
    .line 273
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    const/4 v9, 0x0

    .line 278
    :goto_5
    if-ge v9, v6, :cond_9

    .line 279
    .line 280
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    check-cast v11, Ldefpackage/mg1;

    .line 285
    .line 286
    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    check-cast v11, Ldefpackage/tg1;

    .line 291
    .line 292
    add-int/lit8 v9, v9, 0x1

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_9
    iget v4, v2, Ldefpackage/lg4;->v:I

    .line 296
    .line 297
    invoke-virtual {v2, v15}, Ldefpackage/lg4;->O(I)Ldefpackage/tg1;

    .line 298
    .line 299
    .line 300
    iget-object v4, v0, Ldefpackage/lg4;->b:[I

    .line 301
    .line 302
    invoke-virtual {v0, v4, v1}, Ldefpackage/lg4;->E([II)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez p5, :cond_a

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_a
    if-eqz p3, :cond_e

    .line 312
    .line 313
    if-ltz v4, :cond_b

    .line 314
    .line 315
    move/from16 v17, v19

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_b
    const/16 v17, 0x0

    .line 319
    .line 320
    :goto_6
    if-eqz v17, :cond_c

    .line 321
    .line 322
    invoke-virtual {v0}, Ldefpackage/lg4;->P()V

    .line 323
    .line 324
    .line 325
    iget v3, v0, Ldefpackage/lg4;->t:I

    .line 326
    .line 327
    sub-int/2addr v4, v3

    .line 328
    invoke-virtual {v0, v4}, Ldefpackage/lg4;->a(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ldefpackage/lg4;->P()V

    .line 332
    .line 333
    .line 334
    :cond_c
    iget v3, v0, Ldefpackage/lg4;->t:I

    .line 335
    .line 336
    sub-int/2addr v1, v3

    .line 337
    invoke-virtual {v0, v1}, Ldefpackage/lg4;->a(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Ldefpackage/lg4;->H()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v17, :cond_d

    .line 345
    .line 346
    invoke-virtual {v0}, Ldefpackage/lg4;->M()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ldefpackage/lg4;->j()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Ldefpackage/lg4;->M()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ldefpackage/lg4;->j()V

    .line 356
    .line 357
    .line 358
    :cond_d
    move/from16 v17, v1

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_e
    invoke-virtual {v0, v1, v3}, Ldefpackage/lg4;->I(II)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    add-int/lit8 v1, v1, -0x1

    .line 366
    .line 367
    invoke-virtual {v0, v5, v7, v1}, Ldefpackage/lg4;->J(III)V

    .line 368
    .line 369
    .line 370
    move/from16 v17, v3

    .line 371
    .line 372
    :goto_7
    if-eqz v17, :cond_f

    .line 373
    .line 374
    const-string v0, "Unexpectedly removed anchors"

    .line 375
    .line 376
    invoke-static {v0}, Ldefpackage/l80;->a(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    iget v0, v2, Ldefpackage/lg4;->o:I

    .line 380
    .line 381
    add-int/lit8 v13, v20, 0x1

    .line 382
    .line 383
    aget v1, v23, v13

    .line 384
    .line 385
    const/high16 v3, 0x40000000    # 2.0f

    .line 386
    .line 387
    and-int/2addr v3, v1

    .line 388
    if-eqz v3, :cond_10

    .line 389
    .line 390
    move/from16 v9, v19

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_10
    const v3, 0x3ffffff

    .line 394
    .line 395
    .line 396
    and-int v9, v1, v3

    .line 397
    .line 398
    :goto_8
    add-int/2addr v0, v9

    .line 399
    iput v0, v2, Ldefpackage/lg4;->o:I

    .line 400
    .line 401
    if-eqz p4, :cond_11

    .line 402
    .line 403
    iput v8, v2, Ldefpackage/lg4;->t:I

    .line 404
    .line 405
    add-int/2addr v14, v7

    .line 406
    iput v14, v2, Ldefpackage/lg4;->i:I

    .line 407
    .line 408
    :cond_11
    if-eqz v21, :cond_12

    .line 409
    .line 410
    invoke-virtual {v2, v15}, Ldefpackage/lg4;->T(I)V

    .line 411
    .line 412
    .line 413
    :cond_12
    return-object v10
.end method

.method public static final d(Ldefpackage/hu2;)Ldefpackage/kd3;
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/hu2;->a(Ldefpackage/hu2;)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, "; charset=utf-8"

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :try_start_0
    invoke-static {p0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    const/4 p0, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v1

    .line 36
    :cond_1
    :goto_0
    new-instance v1, Ldefpackage/kd3;

    .line 37
    .line 38
    invoke-direct {v1, v0, p0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public static d0(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p0, v0}, Ldefpackage/si0;->l(Landroid/content/Context;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v3, 0x1d

    .line 35
    .line 36
    if-lt v2, v3, :cond_0

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/kz;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p0, v0}, Ldefpackage/si0;->l(Landroid/content/Context;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_0

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    const-string p0, "Permission "

    .line 65
    .line 66
    const-string v1, " is required by your application to receive broadcasts, please add it to your manifest"

    .line 67
    .line 68
    invoke-static {p0, v0, v1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Ldefpackage/tb4;->e(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_1
    return-object v0
.end method

.method public static final e(Ldefpackage/z34;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    if-nez p1, :cond_8

    .line 4
    .line 5
    instance-of p1, p0, Ljava/lang/AutoCloseable;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    instance-of p1, p0, Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    if-eqz p1, :cond_4

    .line 16
    .line 17
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-ne p0, p1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_9

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 37
    .line 38
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    const-wide/16 v2, 0x1

    .line 41
    .line 42
    invoke-interface {p0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 43
    .line 44
    .line 45
    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    if-eqz v0, :cond_9

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    instance-of p1, p0, Landroid/content/res/TypedArray;

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    check-cast p0, Landroid/content/res/TypedArray;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    instance-of p1, p0, Landroid/media/MediaMetadataRetriever;

    .line 75
    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    check-cast p0, Landroid/media/MediaMetadataRetriever;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    instance-of p1, p0, Landroid/media/MediaDrm;

    .line 85
    .line 86
    if-eqz p1, :cond_7

    .line 87
    .line 88
    check-cast p0, Landroid/media/MediaDrm;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/media/MediaDrm;->release()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_7
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_8
    :try_start_1
    invoke-static {p0}, Ldefpackage/xa3;->o(Ldefpackage/z34;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception p0

    .line 103
    invoke-static {p1, p0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_9
    :goto_1
    return-void
.end method

.method public static e0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->setNamespaceAware(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lorg/xml/sax/InputSource;

    .line 14
    .line 15
    new-instance v2, Ljava/io/StringReader;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1, v0}, Ldefpackage/ud3;->f(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :catch_0
    sget-object p0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 44
    .line 45
    return-object p0
.end method

.method public static f(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 8

    .line 1
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_7

    .line 12
    .line 13
    invoke-interface {p0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    instance-of v4, v3, Lorg/w3c/dom/Element;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    check-cast v3, Lorg/w3c/dom/Element;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v3, 0x0

    .line 25
    :goto_1
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_1
    invoke-interface {v3}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/16 v5, 0x3a

    .line 36
    .line 37
    invoke-static {v4, v5}, Ldefpackage/qm4;->E0(Ljava/lang/String;C)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-interface {v5}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-static {v1, v5}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    instance-of v6, v5, Ljava/util/Collection;

    .line 54
    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    move-object v6, v5

    .line 58
    check-cast v6, Ljava/util/Collection;

    .line 59
    .line 60
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v5}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :cond_3
    move-object v6, v5

    .line 72
    check-cast v6, Ldefpackage/i02;

    .line 73
    .line 74
    iget-boolean v6, v6, Ldefpackage/i02;->p:Z

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    move-object v6, v5

    .line 79
    check-cast v6, Ldefpackage/b02;

    .line 80
    .line 81
    invoke-virtual {v6}, Ldefpackage/b02;->nextInt()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-interface {v7, v6}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    instance-of v6, v6, Lorg/w3c/dom/Element;

    .line 94
    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    invoke-static {v3, p1, p2}, Ldefpackage/ud3;->f(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    :goto_2
    const-string v5, "Response"

    .line 102
    .line 103
    invoke-virtual {p1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_6

    .line 112
    .line 113
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    if-nez v3, :cond_5

    .line 118
    .line 119
    const-string v3, ""

    .line 120
    .line 121
    :cond_5
    invoke-interface {p2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_7
    return-void
.end method

.method public static f0(Ldefpackage/nc1;[Ljava/lang/String;I)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    array-length v3, p1

    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v4, 0x21

    .line 22
    .line 23
    if-ge v3, v4, :cond_0

    .line 24
    .line 25
    aget-object v3, p1, v2

    .line 26
    .line 27
    const-string v4, "android.permission.POST_NOTIFICATIONS"

    .line 28
    .line 29
    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p2, "Permission request for permissions "

    .line 48
    .line 49
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string p2, " must not contain null or empty values"

    .line 57
    .line 58
    invoke-static {p0, p1, p2}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-lez v2, :cond_3

    .line 71
    .line 72
    array-length v3, p1

    .line 73
    sub-int/2addr v3, v2

    .line 74
    new-array v3, v3, [Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v3, p1

    .line 78
    :goto_1
    if-lez v2, :cond_6

    .line 79
    .line 80
    array-length v4, p1

    .line 81
    if-ne v2, v4, :cond_4

    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    move v2, v1

    .line 85
    :goto_2
    array-length v4, p1

    .line 86
    if-ge v1, v4, :cond_6

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    add-int/lit8 v4, v2, 0x1

    .line 99
    .line 100
    aget-object v5, p1, v1

    .line 101
    .line 102
    aput-object v5, v3, v2

    .line 103
    .line 104
    move v2, v4

    .line 105
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static final g(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final g0(Ldefpackage/zs4;Ldefpackage/r62;)Ldefpackage/zs4;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ldefpackage/zs4;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 6
    .line 7
    sget-object v3, Ldefpackage/jj4;->d:Ldefpackage/as4;

    .line 8
    .line 9
    iget-object v3, v2, Ldefpackage/ij4;->a:Ldefpackage/as4;

    .line 10
    .line 11
    sget-object v4, Ldefpackage/rv2;->F:Ldefpackage/rv2;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    :goto_0
    move-object v5, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object v3, Ldefpackage/jj4;->d:Ldefpackage/as4;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-wide v3, v2, Ldefpackage/ij4;->b:J

    .line 25
    .line 26
    sget-object v6, Ldefpackage/bt4;->b:[Ldefpackage/ct4;

    .line 27
    .line 28
    const-wide v23, 0xff00000000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long v6, v3, v23

    .line 34
    .line 35
    const-wide/16 v25, 0x0

    .line 36
    .line 37
    cmp-long v6, v6, v25

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    sget-wide v3, Ldefpackage/jj4;->a:J

    .line 42
    .line 43
    :cond_1
    move-wide v6, v3

    .line 44
    iget-object v3, v2, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    sget-object v3, Ldefpackage/gb1;->p:Ldefpackage/gb1;

    .line 49
    .line 50
    :cond_2
    move-object v8, v3

    .line 51
    iget-object v3, v2, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget v3, v3, Ldefpackage/eb1;->a:I

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/4 v3, 0x0

    .line 59
    :goto_2
    new-instance v9, Ldefpackage/eb1;

    .line 60
    .line 61
    invoke-direct {v9, v3}, Ldefpackage/eb1;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v2, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    iget v3, v3, Ldefpackage/fb1;->a:I

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const v3, 0xffff

    .line 72
    .line 73
    .line 74
    :goto_3
    new-instance v10, Ldefpackage/fb1;

    .line 75
    .line 76
    invoke-direct {v10, v3}, Ldefpackage/fb1;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v2, Ldefpackage/ij4;->f:Ldefpackage/vk0;

    .line 80
    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    sget-object v3, Ldefpackage/vk0;->a:Ldefpackage/vk0;

    .line 84
    .line 85
    :cond_5
    move-object v11, v3

    .line 86
    iget-object v3, v2, Ldefpackage/ij4;->g:Ljava/lang/String;

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    const-string v3, ""

    .line 91
    .line 92
    :cond_6
    move-object v12, v3

    .line 93
    iget-wide v3, v2, Ldefpackage/ij4;->h:J

    .line 94
    .line 95
    and-long v13, v3, v23

    .line 96
    .line 97
    cmp-long v13, v13, v25

    .line 98
    .line 99
    if-nez v13, :cond_7

    .line 100
    .line 101
    sget-wide v3, Ldefpackage/jj4;->b:J

    .line 102
    .line 103
    :cond_7
    move-wide v13, v3

    .line 104
    iget-object v3, v2, Ldefpackage/ij4;->i:Ldefpackage/hr;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    iget v3, v3, Ldefpackage/hr;->a:F

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    move v3, v4

    .line 113
    :goto_4
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-eqz v15, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move v4, v3

    .line 121
    :goto_5
    new-instance v15, Ldefpackage/hr;

    .line 122
    .line 123
    invoke-direct {v15, v4}, Ldefpackage/hr;-><init>(F)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v2, Ldefpackage/ij4;->j:Ldefpackage/bs4;

    .line 127
    .line 128
    if-nez v3, :cond_a

    .line 129
    .line 130
    sget-object v3, Ldefpackage/bs4;->c:Ldefpackage/bs4;

    .line 131
    .line 132
    :cond_a
    move-object/from16 v16, v3

    .line 133
    .line 134
    iget-object v3, v2, Ldefpackage/ij4;->k:Ldefpackage/vd2;

    .line 135
    .line 136
    if-nez v3, :cond_b

    .line 137
    .line 138
    sget-object v3, Ldefpackage/vd2;->p:Ldefpackage/vd2;

    .line 139
    .line 140
    invoke-static {}, Ldefpackage/fh0;->m()Ldefpackage/vd2;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :cond_b
    move-object/from16 v17, v3

    .line 145
    .line 146
    iget-wide v3, v2, Ldefpackage/ij4;->l:J

    .line 147
    .line 148
    const-wide/16 v18, 0x10

    .line 149
    .line 150
    cmp-long v18, v3, v18

    .line 151
    .line 152
    if-eqz v18, :cond_c

    .line 153
    .line 154
    :goto_6
    move-wide/from16 v18, v3

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_c
    sget-wide v3, Ldefpackage/jj4;->c:J

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :goto_7
    iget-object v3, v2, Ldefpackage/ij4;->m:Ldefpackage/sr4;

    .line 161
    .line 162
    if-nez v3, :cond_d

    .line 163
    .line 164
    sget-object v3, Ldefpackage/sr4;->b:Ldefpackage/sr4;

    .line 165
    .line 166
    :cond_d
    move-object/from16 v20, v3

    .line 167
    .line 168
    iget-object v3, v2, Ldefpackage/ij4;->n:Ldefpackage/xb4;

    .line 169
    .line 170
    if-nez v3, :cond_e

    .line 171
    .line 172
    sget-object v3, Ldefpackage/xb4;->d:Ldefpackage/xb4;

    .line 173
    .line 174
    :cond_e
    move-object/from16 v21, v3

    .line 175
    .line 176
    iget-object v2, v2, Ldefpackage/ij4;->o:Ldefpackage/q05;

    .line 177
    .line 178
    if-nez v2, :cond_f

    .line 179
    .line 180
    sget-object v2, Ldefpackage/c71;->d:Ldefpackage/c71;

    .line 181
    .line 182
    :cond_f
    move-object/from16 v22, v2

    .line 183
    .line 184
    new-instance v4, Ldefpackage/ij4;

    .line 185
    .line 186
    invoke-direct/range {v4 .. v22}, Ldefpackage/ij4;-><init>(Ldefpackage/as4;JLdefpackage/gb1;Ldefpackage/eb1;Ldefpackage/fb1;Ldefpackage/vk0;Ljava/lang/String;JLdefpackage/hr;Ldefpackage/bs4;Ldefpackage/vd2;JLdefpackage/sr4;Ldefpackage/xb4;Ldefpackage/q05;)V

    .line 187
    .line 188
    .line 189
    iget-object v2, v0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 190
    .line 191
    sget v3, Ldefpackage/td3;->b:I

    .line 192
    .line 193
    new-instance v5, Ldefpackage/sd3;

    .line 194
    .line 195
    iget v3, v2, Ldefpackage/sd3;->a:I

    .line 196
    .line 197
    const/4 v6, 0x5

    .line 198
    if-nez v3, :cond_10

    .line 199
    .line 200
    move v3, v6

    .line 201
    :cond_10
    iget v7, v2, Ldefpackage/sd3;->b:I

    .line 202
    .line 203
    const/4 v8, 0x3

    .line 204
    const/4 v9, 0x0

    .line 205
    const/4 v10, 0x1

    .line 206
    if-ne v7, v8, :cond_13

    .line 207
    .line 208
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-eqz v7, :cond_12

    .line 213
    .line 214
    if-ne v7, v10, :cond_11

    .line 215
    .line 216
    :goto_8
    move v7, v6

    .line 217
    goto :goto_9

    .line 218
    :cond_11
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 219
    .line 220
    .line 221
    return-object v9

    .line 222
    :cond_12
    const/4 v6, 0x4

    .line 223
    goto :goto_8

    .line 224
    :cond_13
    if-nez v7, :cond_16

    .line 225
    .line 226
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_15

    .line 231
    .line 232
    if-ne v6, v10, :cond_14

    .line 233
    .line 234
    const/4 v6, 0x2

    .line 235
    goto :goto_8

    .line 236
    :cond_14
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 237
    .line 238
    .line 239
    return-object v9

    .line 240
    :cond_15
    move v7, v10

    .line 241
    :cond_16
    :goto_9
    iget-wide v8, v2, Ldefpackage/sd3;->c:J

    .line 242
    .line 243
    and-long v11, v8, v23

    .line 244
    .line 245
    cmp-long v6, v11, v25

    .line 246
    .line 247
    if-nez v6, :cond_17

    .line 248
    .line 249
    sget-wide v8, Ldefpackage/td3;->a:J

    .line 250
    .line 251
    :cond_17
    iget-object v6, v2, Ldefpackage/sd3;->d:Ldefpackage/cs4;

    .line 252
    .line 253
    if-nez v6, :cond_18

    .line 254
    .line 255
    sget-object v6, Ldefpackage/cs4;->c:Ldefpackage/cs4;

    .line 256
    .line 257
    :cond_18
    iget-object v11, v2, Ldefpackage/sd3;->e:Ldefpackage/zg3;

    .line 258
    .line 259
    iget-object v12, v2, Ldefpackage/sd3;->f:Ldefpackage/ra2;

    .line 260
    .line 261
    iget v13, v2, Ldefpackage/sd3;->g:I

    .line 262
    .line 263
    if-nez v13, :cond_19

    .line 264
    .line 265
    sget v13, Ldefpackage/ma2;->b:I

    .line 266
    .line 267
    :cond_19
    iget v14, v2, Ldefpackage/sd3;->h:I

    .line 268
    .line 269
    if-nez v14, :cond_1a

    .line 270
    .line 271
    move v14, v10

    .line 272
    :cond_1a
    iget-object v2, v2, Ldefpackage/sd3;->i:Ldefpackage/qs4;

    .line 273
    .line 274
    if-nez v2, :cond_1b

    .line 275
    .line 276
    sget-object v2, Ldefpackage/qs4;->c:Ldefpackage/qs4;

    .line 277
    .line 278
    :cond_1b
    move-object v15, v2

    .line 279
    move-object v10, v6

    .line 280
    move v6, v3

    .line 281
    invoke-direct/range {v5 .. v15}, Ldefpackage/sd3;-><init>(IIJLdefpackage/cs4;Ldefpackage/zg3;Ldefpackage/ra2;IILdefpackage/qs4;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v0, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    .line 285
    .line 286
    invoke-direct {v1, v4, v5, v0}, Ldefpackage/zs4;-><init>(Ldefpackage/ij4;Ldefpackage/sd3;Ldefpackage/eh3;)V

    .line 287
    .line 288
    .line 289
    return-object v1
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "&"

    .line 5
    .line 6
    const-string v1, "&amp;"

    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "<"

    .line 13
    .line 14
    const-string v1, "&lt;"

    .line 15
    .line 16
    invoke-static {p0, v0, v1}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, ">"

    .line 21
    .line 22
    const-string v1, "&gt;"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "\""

    .line 29
    .line 30
    const-string v1, "&quot;"

    .line 31
    .line 32
    invoke-static {p0, v0, v1}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static final h0(Ljava/lang/String;)V
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
    const-string v1, "client_cert"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final i(ILdefpackage/nc3;Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/nc3;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p1}, Ldefpackage/nc3;->b()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge p0, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ldefpackage/nc3;->c(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget-object p1, p1, Ldefpackage/nc3;->c:Ldefpackage/ue1;

    .line 28
    .line 29
    iget-object p1, p1, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ldefpackage/p03;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ldefpackage/p03;->d(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 v0, -0x1

    .line 38
    if-ltz p2, :cond_2

    .line 39
    .line 40
    iget-object p1, p1, Ldefpackage/p03;->c:[I

    .line 41
    .line 42
    aget p1, p1, p2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move p1, v0

    .line 46
    :goto_0
    if-eq p1, v0, :cond_3

    .line 47
    .line 48
    return p1

    .line 49
    :cond_3
    :goto_1
    return p0
.end method

.method public static final i0(Ljava/lang/String;)V
    .locals 3

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
    const/4 v1, 0x0

    .line 13
    const-string v2, "download_directory_uri"

    .line 14
    .line 15
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-static {}, Ldefpackage/j51;->o()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static final j(Ldefpackage/u84;JLdefpackage/wf1;)Ljava/lang/Object;
    .locals 4

    .line 1
    :cond_0
    :goto_0
    iget-wide v0, p0, Ldefpackage/u84;->e:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    if-ltz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/u84;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    return-object p0

    .line 15
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ldefpackage/p90;->d()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Ldefpackage/ud3;->a:Ldefpackage/f01;

    .line 20
    .line 21
    if-ne v0, v1, :cond_3

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_3
    check-cast v0, Ldefpackage/p90;

    .line 25
    .line 26
    check-cast v0, Ldefpackage/u84;

    .line 27
    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    :cond_4
    :goto_2
    move-object p0, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_5
    iget-wide v0, p0, Ldefpackage/u84;->e:J

    .line 33
    .line 34
    const-wide/16 v2, 0x1

    .line 35
    .line 36
    add-long/2addr v0, v2

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {p3, v0, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ldefpackage/u84;

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ldefpackage/p90;->i(Ldefpackage/u84;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p0}, Ldefpackage/u84;->f()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0}, Ldefpackage/p90;->h()V

    .line 60
    .line 61
    .line 62
    goto :goto_2
.end method

.method public static final j0(I)V
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
    const-string v1, "download_storage"

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final k()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/ud3;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move-object v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v2, "active_music_folder_id_"

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const-string v2, "default"

    .line 20
    .line 21
    invoke-static {v0, v2}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return-object v0

    .line 35
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static final k0([S)V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 9
    .line 10
    .line 11
    array-length v2, p0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    aget-short v5, p0, v3

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    add-int/2addr v4, v6

    .line 20
    if-le v4, v6, :cond_0

    .line 21
    .line 22
    const-string v6, ","

    .line 23
    .line 24
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 32
    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "equalizer_band_levels"

    .line 60
    .line 61
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static final l()Z
    .locals 2

    .line 1
    const-string v0, "bitrate_visible"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static final l0(Ljava/util/List;)V
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
    new-instance v1, Ldefpackage/nk1;

    .line 17
    .line 18
    invoke-direct {v1}, Ldefpackage/nk1;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v1, "home_sector_list"

    .line 26
    .line 27
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final m()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "color_accent"

    .line 2
    .line 3
    const-string v1, "DYNAMIC"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    return-object v0
.end method

.method public static final m0(Ljava/lang/String;)V
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
    const-string v1, "in_use_server_address"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Ldefpackage/f14;

    .line 10
    .line 11
    invoke-direct {v1, v0, p0}, Ldefpackage/f14;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Ldefpackage/g14;->c:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget-object v3, Ldefpackage/g14;->b:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroid/util/SparseArray;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-lez v5, :cond_3

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Ldefpackage/e14;

    .line 39
    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-object v6, v5, Ldefpackage/e14;->b:Landroid/content/res/Configuration;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v6, v7}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    iget v6, v5, Ldefpackage/e14;->c:I

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_0
    :goto_0
    if-eqz p0, :cond_2

    .line 65
    .line 66
    iget v6, v5, Ldefpackage/e14;->c:I

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/content/res/Resources$Theme;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-ne v6, v7, :cond_2

    .line 73
    .line 74
    :cond_1
    iget-object v3, v5, Ldefpackage/e14;->a:Landroid/content/res/ColorStateList;

    .line 75
    .line 76
    monitor-exit v2

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 79
    .line 80
    .line 81
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    move-object v3, v4

    .line 83
    :goto_1
    if-eqz v3, :cond_4

    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_4
    sget-object v2, Ldefpackage/g14;->a:Ljava/lang/ThreadLocal;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Landroid/util/TypedValue;

    .line 93
    .line 94
    if-nez v3, :cond_5

    .line 95
    .line 96
    new-instance v3, Landroid/util/TypedValue;

    .line 97
    .line 98
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    const/4 v2, 0x1

    .line 105
    invoke-virtual {v0, p1, v3, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 106
    .line 107
    .line 108
    iget v2, v3, Landroid/util/TypedValue;->type:I

    .line 109
    .line 110
    const/16 v3, 0x1c

    .line 111
    .line 112
    if-lt v2, v3, :cond_6

    .line 113
    .line 114
    const/16 v3, 0x1f

    .line 115
    .line 116
    if-gt v2, v3, :cond_6

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :try_start_1
    invoke-static {v0, v2, p0}, Ldefpackage/t50;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 124
    .line 125
    .line 126
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 127
    goto :goto_2

    .line 128
    :catch_0
    move-exception v2

    .line 129
    const-string v3, "ResourcesCompat"

    .line 130
    .line 131
    const-string v5, "Failed to inflate ColorStateList, leaving it to the framework"

    .line 132
    .line 133
    invoke-static {v3, v5, v2}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 134
    .line 135
    .line 136
    :goto_2
    if-eqz v4, :cond_8

    .line 137
    .line 138
    sget-object v2, Ldefpackage/g14;->c:Ljava/lang/Object;

    .line 139
    .line 140
    monitor-enter v2

    .line 141
    :try_start_2
    sget-object v0, Ldefpackage/g14;->b:Ljava/util/WeakHashMap;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Landroid/util/SparseArray;

    .line 148
    .line 149
    if-nez v3, :cond_7

    .line 150
    .line 151
    new-instance v3, Landroid/util/SparseArray;

    .line 152
    .line 153
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :catchall_1
    move-exception p0

    .line 161
    goto :goto_4

    .line 162
    :cond_7
    :goto_3
    new-instance v0, Ldefpackage/e14;

    .line 163
    .line 164
    iget-object v1, v1, Ldefpackage/f14;->a:Landroid/content/res/Resources;

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-direct {v0, v4, v1, p0}, Ldefpackage/e14;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, p1, v0}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    monitor-exit v2

    .line 177
    goto :goto_5

    .line 178
    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 179
    throw p0

    .line 180
    :cond_8
    invoke-virtual {v0, p1, p0}, Landroid/content/res/Resources;->getColorStateList(ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    :goto_5
    return-object v4

    .line 185
    :goto_6
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    throw p0
.end method

.method public static final n0(Ljava/lang/String;)V
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
    const-string v1, "local_address"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final o()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "download_directory_uri"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final o0(Z)V
    .locals 1

    .line 1
    const-string v0, "low_security"

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final p()I
    .locals 3

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
    const-string v1, "download_storage"

    .line 13
    .line 14
    const-string v2, "0"

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public static final p0(Z)V
    .locals 1

    .line 1
    const-string v0, "open_subsonic"

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final q(S)[S
    .locals 7

    .line 1
    const-string v0, "equalizer_band_levels"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_4

    .line 17
    :cond_0
    const-string v2, ","

    .line 18
    .line 19
    filled-new-array {v2}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x6

    .line 24
    invoke-static {v0, v2, v3}, Ldefpackage/qm4;->C0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-ge v2, p0, :cond_1

    .line 33
    .line 34
    new-array p0, p0, [S

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    new-array v2, p0, [S

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    move v4, v3

    .line 41
    :goto_0
    if-ge v4, p0, :cond_5

    .line 42
    .line 43
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Ldefpackage/xm4;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/16 v6, -0x8000

    .line 63
    .line 64
    if-lt v5, v6, :cond_3

    .line 65
    .line 66
    const/16 v6, 0x7fff

    .line 67
    .line 68
    if-le v5, v6, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    int-to-short v5, v5

    .line 72
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    :goto_1
    move-object v5, v1

    .line 78
    :goto_2
    if-eqz v5, :cond_4

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Short;->shortValue()S

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move v5, v3

    .line 86
    :goto_3
    aput-short v5, v2, v4

    .line 87
    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    return-object v2

    .line 92
    :cond_6
    :goto_4
    new-array p0, p0, [S

    .line 93
    .line 94
    return-object p0
.end method

.method public static final q0(Ljava/lang/String;)V
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
    const-string v1, "password"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final r()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "home_sector_list"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final r0(F)V
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
    const-string v1, "playback_speed"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

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

.method public static final s()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "home_sort_playlists"

    .line 2
    .line 3
    const-string v1, "ORDER_BY_NAME"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    return-object v0
.end method

.method public static final s0(F)V
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
    const-string v1, "playback_speed_manual_pitch_value"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

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

.method public static final t()I
    .locals 3

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
    const-string v1, "image_size"

    .line 13
    .line 14
    const-string v2, "-1"

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public static final t0(I)V
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
    const-string v1, "repeat_mode"

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

.method public static final u()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "in_use_server_address"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    :cond_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public static final u0(Ljava/lang/String;)V
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
    const-string v1, "salt"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final v()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "local_address"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final v0(Ljava/lang/String;)V
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
    const-string v1, "server"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static w(Landroid/content/Context;)Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ldefpackage/ne;->e(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Ldefpackage/ok;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {p0, v0, v1}, Ldefpackage/ok;-><init>(Landroid/os/Handler;I)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static final w0(Ljava/lang/String;)V
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
    const-string v1, "server_id"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

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

.method public static final x()I
    .locals 2

    .line 1
    const-string v0, "network_ping_timeout_base"

    .line 2
    .line 3
    const-string v1, "2"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    :goto_0
    invoke-static {v1}, Ldefpackage/xm4;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x2

    .line 25
    :goto_1
    const/4 v1, 0x1

    .line 26
    if-ge v0, v1, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    return v0
.end method

.method public static final x0(Z)V
    .locals 1

    .line 1
    const-string v0, "shuffle_mode"

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final y()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "password"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static final y0(Z)V
    .locals 1

    .line 1
    const-string v0, "homemusic_smart_shuffle_chosen"

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final z()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "replay_gain_mode"

    .line 2
    .line 3
    const-string v1, "disabled"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final z0(Z)V
    .locals 1

    .line 1
    const-string v0, "sync_starred_albums_for_offline_use"

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
