.class public final Lcom/eddyizm/tempus/github/models/Author;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private avatarUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "avatar_url"
    .end annotation
.end field

.field private eventsUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "events_url"
    .end annotation
.end field

.field private followersUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "followers_url"
    .end annotation
.end field

.field private followingUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "following_url"
    .end annotation
.end field

.field private gistsUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "gists_url"
    .end annotation
.end field

.field private gravatarId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "gravatar_id"
    .end annotation
.end field

.field private htmlUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "html_url"
    .end annotation
.end field

.field private id:Ljava/lang/Integer;
    .annotation runtime Lka4;
        value = "id"
    .end annotation
.end field

.field private login:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "login"
    .end annotation
.end field

.field private nodeId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "node_id"
    .end annotation
.end field

.field private organizationsUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "organizations_url"
    .end annotation
.end field

.field private receivedEventsUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "received_events_url"
    .end annotation
.end field

.field private reposUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "repos_url"
    .end annotation
.end field

.field private siteAdmin:Ljava/lang/Boolean;
    .annotation runtime Lka4;
        value = "site_admin"
    .end annotation
.end field

.field private starredUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "starred_url"
    .end annotation
.end field

.field private subscriptionsUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "subscriptions_url"
    .end annotation
.end field

.field private type:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "type"
    .end annotation
.end field

.field private url:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "url"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 21

    .line 217
    const v19, 0x3ffff

    const/16 v20, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v20}, Lcom/eddyizm/tempus/github/models/Author;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 200
    iput-object p2, p0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 201
    iput-object p3, p0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 202
    iput-object p4, p0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 203
    iput-object p5, p0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 204
    iput-object p6, p0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 205
    iput-object p7, p0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 206
    iput-object p8, p0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 207
    iput-object p9, p0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 208
    iput-object p10, p0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 209
    iput-object p11, p0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 210
    iput-object p12, p0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 211
    iput-object p13, p0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 212
    iput-object p14, p0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 213
    iput-object p15, p0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 214
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 215
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 216
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILxj0;)V
    .locals 19

    .line 1
    move/from16 v0, p19

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object/from16 v1, p1

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v3, v0, 0x2

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object/from16 v3, p2

    .line 18
    .line 19
    :goto_1
    and-int/lit8 v4, v0, 0x4

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move-object/from16 v4, p3

    .line 26
    .line 27
    :goto_2
    and-int/lit8 v5, v0, 0x8

    .line 28
    .line 29
    if-eqz v5, :cond_3

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    goto :goto_3

    .line 33
    :cond_3
    move-object/from16 v5, p4

    .line 34
    .line 35
    :goto_3
    and-int/lit8 v6, v0, 0x10

    .line 36
    .line 37
    if-eqz v6, :cond_4

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    goto :goto_4

    .line 41
    :cond_4
    move-object/from16 v6, p5

    .line 42
    .line 43
    :goto_4
    and-int/lit8 v7, v0, 0x20

    .line 44
    .line 45
    if-eqz v7, :cond_5

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    goto :goto_5

    .line 49
    :cond_5
    move-object/from16 v7, p6

    .line 50
    .line 51
    :goto_5
    and-int/lit8 v8, v0, 0x40

    .line 52
    .line 53
    if-eqz v8, :cond_6

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    goto :goto_6

    .line 57
    :cond_6
    move-object/from16 v8, p7

    .line 58
    .line 59
    :goto_6
    and-int/lit16 v9, v0, 0x80

    .line 60
    .line 61
    if-eqz v9, :cond_7

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    goto :goto_7

    .line 65
    :cond_7
    move-object/from16 v9, p8

    .line 66
    .line 67
    :goto_7
    and-int/lit16 v10, v0, 0x100

    .line 68
    .line 69
    if-eqz v10, :cond_8

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    goto :goto_8

    .line 73
    :cond_8
    move-object/from16 v10, p9

    .line 74
    .line 75
    :goto_8
    and-int/lit16 v11, v0, 0x200

    .line 76
    .line 77
    if-eqz v11, :cond_9

    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    goto :goto_9

    .line 81
    :cond_9
    move-object/from16 v11, p10

    .line 82
    .line 83
    :goto_9
    and-int/lit16 v12, v0, 0x400

    .line 84
    .line 85
    if-eqz v12, :cond_a

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    goto :goto_a

    .line 89
    :cond_a
    move-object/from16 v12, p11

    .line 90
    .line 91
    :goto_a
    and-int/lit16 v13, v0, 0x800

    .line 92
    .line 93
    if-eqz v13, :cond_b

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    goto :goto_b

    .line 97
    :cond_b
    move-object/from16 v13, p12

    .line 98
    .line 99
    :goto_b
    and-int/lit16 v14, v0, 0x1000

    .line 100
    .line 101
    if-eqz v14, :cond_c

    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    goto :goto_c

    .line 105
    :cond_c
    move-object/from16 v14, p13

    .line 106
    .line 107
    :goto_c
    and-int/lit16 v15, v0, 0x2000

    .line 108
    .line 109
    if-eqz v15, :cond_d

    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    goto :goto_d

    .line 113
    :cond_d
    move-object/from16 v15, p14

    .line 114
    .line 115
    :goto_d
    and-int/lit16 v2, v0, 0x4000

    .line 116
    .line 117
    if-eqz v2, :cond_e

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    goto :goto_e

    .line 121
    :cond_e
    move-object/from16 v2, p15

    .line 122
    .line 123
    :goto_e
    const v16, 0x8000

    .line 124
    .line 125
    .line 126
    and-int v16, v0, v16

    .line 127
    .line 128
    if-eqz v16, :cond_f

    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    goto :goto_f

    .line 133
    :cond_f
    move-object/from16 v16, p16

    .line 134
    .line 135
    :goto_f
    const/high16 v17, 0x10000

    .line 136
    .line 137
    and-int v17, v0, v17

    .line 138
    .line 139
    if-eqz v17, :cond_10

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    goto :goto_10

    .line 144
    :cond_10
    move-object/from16 v17, p17

    .line 145
    .line 146
    :goto_10
    const/high16 v18, 0x20000

    .line 147
    .line 148
    and-int v0, v0, v18

    .line 149
    .line 150
    if-eqz v0, :cond_11

    .line 151
    .line 152
    const/16 p19, 0x0

    .line 153
    .line 154
    :goto_11
    move-object/from16 p1, p0

    .line 155
    .line 156
    move-object/from16 p2, v1

    .line 157
    .line 158
    move-object/from16 p16, v2

    .line 159
    .line 160
    move-object/from16 p3, v3

    .line 161
    .line 162
    move-object/from16 p4, v4

    .line 163
    .line 164
    move-object/from16 p5, v5

    .line 165
    .line 166
    move-object/from16 p6, v6

    .line 167
    .line 168
    move-object/from16 p7, v7

    .line 169
    .line 170
    move-object/from16 p8, v8

    .line 171
    .line 172
    move-object/from16 p9, v9

    .line 173
    .line 174
    move-object/from16 p10, v10

    .line 175
    .line 176
    move-object/from16 p11, v11

    .line 177
    .line 178
    move-object/from16 p12, v12

    .line 179
    .line 180
    move-object/from16 p13, v13

    .line 181
    .line 182
    move-object/from16 p14, v14

    .line 183
    .line 184
    move-object/from16 p15, v15

    .line 185
    .line 186
    move-object/from16 p17, v16

    .line 187
    .line 188
    move-object/from16 p18, v17

    .line 189
    .line 190
    goto :goto_12

    .line 191
    :cond_11
    move-object/from16 p19, p18

    .line 192
    .line 193
    goto :goto_11

    .line 194
    :goto_12
    invoke-direct/range {p1 .. p19}, Lcom/eddyizm/tempus/github/models/Author;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/eddyizm/tempus/github/models/Author;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p19

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v2, p1

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v3, v1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    iget-object v3, v0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object/from16 v3, p2

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v4, v1, 0x4

    .line 24
    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    iget-object v4, v0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v4, p3

    .line 31
    .line 32
    :goto_2
    and-int/lit8 v5, v1, 0x8

    .line 33
    .line 34
    if-eqz v5, :cond_3

    .line 35
    .line 36
    iget-object v5, v0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move-object/from16 v5, p4

    .line 40
    .line 41
    :goto_3
    and-int/lit8 v6, v1, 0x10

    .line 42
    .line 43
    if-eqz v6, :cond_4

    .line 44
    .line 45
    iget-object v6, v0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-object/from16 v6, p5

    .line 49
    .line 50
    :goto_4
    and-int/lit8 v7, v1, 0x20

    .line 51
    .line 52
    if-eqz v7, :cond_5

    .line 53
    .line 54
    iget-object v7, v0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :cond_5
    move-object/from16 v7, p6

    .line 58
    .line 59
    :goto_5
    and-int/lit8 v8, v1, 0x40

    .line 60
    .line 61
    if-eqz v8, :cond_6

    .line 62
    .line 63
    iget-object v8, v0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_6
    move-object/from16 v8, p7

    .line 67
    .line 68
    :goto_6
    and-int/lit16 v9, v1, 0x80

    .line 69
    .line 70
    if-eqz v9, :cond_7

    .line 71
    .line 72
    iget-object v9, v0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_7

    .line 75
    :cond_7
    move-object/from16 v9, p8

    .line 76
    .line 77
    :goto_7
    and-int/lit16 v10, v1, 0x100

    .line 78
    .line 79
    if-eqz v10, :cond_8

    .line 80
    .line 81
    iget-object v10, v0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_8

    .line 84
    :cond_8
    move-object/from16 v10, p9

    .line 85
    .line 86
    :goto_8
    and-int/lit16 v11, v1, 0x200

    .line 87
    .line 88
    if-eqz v11, :cond_9

    .line 89
    .line 90
    iget-object v11, v0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_9

    .line 93
    :cond_9
    move-object/from16 v11, p10

    .line 94
    .line 95
    :goto_9
    and-int/lit16 v12, v1, 0x400

    .line 96
    .line 97
    if-eqz v12, :cond_a

    .line 98
    .line 99
    iget-object v12, v0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 100
    .line 101
    goto :goto_a

    .line 102
    :cond_a
    move-object/from16 v12, p11

    .line 103
    .line 104
    :goto_a
    and-int/lit16 v13, v1, 0x800

    .line 105
    .line 106
    if-eqz v13, :cond_b

    .line 107
    .line 108
    iget-object v13, v0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 109
    .line 110
    goto :goto_b

    .line 111
    :cond_b
    move-object/from16 v13, p12

    .line 112
    .line 113
    :goto_b
    and-int/lit16 v14, v1, 0x1000

    .line 114
    .line 115
    if-eqz v14, :cond_c

    .line 116
    .line 117
    iget-object v14, v0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 118
    .line 119
    goto :goto_c

    .line 120
    :cond_c
    move-object/from16 v14, p13

    .line 121
    .line 122
    :goto_c
    and-int/lit16 v15, v1, 0x2000

    .line 123
    .line 124
    if-eqz v15, :cond_d

    .line 125
    .line 126
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 127
    .line 128
    goto :goto_d

    .line 129
    :cond_d
    move-object/from16 v15, p14

    .line 130
    .line 131
    :goto_d
    move-object/from16 p1, v2

    .line 132
    .line 133
    and-int/lit16 v2, v1, 0x4000

    .line 134
    .line 135
    if-eqz v2, :cond_e

    .line 136
    .line 137
    iget-object v2, v0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 138
    .line 139
    goto :goto_e

    .line 140
    :cond_e
    move-object/from16 v2, p15

    .line 141
    .line 142
    :goto_e
    const v16, 0x8000

    .line 143
    .line 144
    .line 145
    and-int v16, v1, v16

    .line 146
    .line 147
    if-eqz v16, :cond_f

    .line 148
    .line 149
    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_f

    .line 152
    :cond_f
    move-object/from16 v1, p16

    .line 153
    .line 154
    :goto_f
    const/high16 v16, 0x10000

    .line 155
    .line 156
    and-int v16, p19, v16

    .line 157
    .line 158
    move-object/from16 p2, v1

    .line 159
    .line 160
    if-eqz v16, :cond_10

    .line 161
    .line 162
    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 163
    .line 164
    goto :goto_10

    .line 165
    :cond_10
    move-object/from16 v1, p17

    .line 166
    .line 167
    :goto_10
    const/high16 v16, 0x20000

    .line 168
    .line 169
    and-int v16, p19, v16

    .line 170
    .line 171
    if-eqz v16, :cond_11

    .line 172
    .line 173
    move-object/from16 p3, v1

    .line 174
    .line 175
    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 176
    .line 177
    move-object/from16 p18, p3

    .line 178
    .line 179
    move-object/from16 p19, v1

    .line 180
    .line 181
    :goto_11
    move-object/from16 p17, p2

    .line 182
    .line 183
    move-object/from16 p16, v2

    .line 184
    .line 185
    move-object/from16 p3, v3

    .line 186
    .line 187
    move-object/from16 p4, v4

    .line 188
    .line 189
    move-object/from16 p5, v5

    .line 190
    .line 191
    move-object/from16 p6, v6

    .line 192
    .line 193
    move-object/from16 p7, v7

    .line 194
    .line 195
    move-object/from16 p8, v8

    .line 196
    .line 197
    move-object/from16 p9, v9

    .line 198
    .line 199
    move-object/from16 p10, v10

    .line 200
    .line 201
    move-object/from16 p11, v11

    .line 202
    .line 203
    move-object/from16 p12, v12

    .line 204
    .line 205
    move-object/from16 p13, v13

    .line 206
    .line 207
    move-object/from16 p14, v14

    .line 208
    .line 209
    move-object/from16 p15, v15

    .line 210
    .line 211
    move-object/from16 p2, p1

    .line 212
    .line 213
    move-object/from16 p1, v0

    .line 214
    .line 215
    goto :goto_12

    .line 216
    :cond_11
    move-object/from16 p19, p18

    .line 217
    .line 218
    move-object/from16 p18, v1

    .line 219
    .line 220
    goto :goto_11

    .line 221
    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/eddyizm/tempus/github/models/Author;->copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/eddyizm/tempus/github/models/Author;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component11()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component12()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component13()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component14()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component15()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component16()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component17()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component18()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component8()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component9()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/eddyizm/tempus/github/models/Author;
    .locals 19

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/github/models/Author;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    move-object/from16 v7, p7

    .line 16
    .line 17
    move-object/from16 v8, p8

    .line 18
    .line 19
    move-object/from16 v9, p9

    .line 20
    .line 21
    move-object/from16 v10, p10

    .line 22
    .line 23
    move-object/from16 v11, p11

    .line 24
    .line 25
    move-object/from16 v12, p12

    .line 26
    .line 27
    move-object/from16 v13, p13

    .line 28
    .line 29
    move-object/from16 v14, p14

    .line 30
    .line 31
    move-object/from16 v15, p15

    .line 32
    .line 33
    move-object/from16 v16, p16

    .line 34
    .line 35
    move-object/from16 v17, p17

    .line 36
    .line 37
    move-object/from16 v18, p18

    .line 38
    .line 39
    invoke-direct/range {v0 .. v18}, Lcom/eddyizm/tempus/github/models/Author;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/eddyizm/tempus/github/models/Author;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/eddyizm/tempus/github/models/Author;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_e

    .line 154
    .line 155
    return v2

    .line 156
    :cond_e
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_f

    .line 165
    .line 166
    return v2

    .line 167
    :cond_f
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_10

    .line 176
    .line 177
    return v2

    .line 178
    :cond_10
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_11

    .line 187
    .line 188
    return v2

    .line 189
    :cond_11
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_12

    .line 198
    .line 199
    return v2

    .line 200
    :cond_12
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 201
    .line 202
    iget-object p1, p1, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_13

    .line 209
    .line 210
    return v2

    .line 211
    :cond_13
    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEventsUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFollowersUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFollowingUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGistsUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGravatarId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHtmlUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLogin()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNodeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOrganizationsUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReceivedEventsUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReposUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSiteAdmin()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStarredUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSubscriptionsUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move v2, v1

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    move v2, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 67
    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    move v2, v1

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 80
    .line 81
    if-nez v2, :cond_6

    .line 82
    .line 83
    move v2, v1

    .line 84
    goto :goto_6

    .line 85
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_6
    add-int/2addr v0, v2

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    .line 91
    .line 92
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v2, :cond_7

    .line 95
    .line 96
    move v2, v1

    .line 97
    goto :goto_7

    .line 98
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_7
    add-int/2addr v0, v2

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 106
    .line 107
    if-nez v2, :cond_8

    .line 108
    .line 109
    move v2, v1

    .line 110
    goto :goto_8

    .line 111
    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    :goto_8
    add-int/2addr v0, v2

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    .line 117
    .line 118
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 119
    .line 120
    if-nez v2, :cond_9

    .line 121
    .line 122
    move v2, v1

    .line 123
    goto :goto_9

    .line 124
    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    :goto_9
    add-int/2addr v0, v2

    .line 129
    mul-int/lit8 v0, v0, 0x1f

    .line 130
    .line 131
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v2, :cond_a

    .line 134
    .line 135
    move v2, v1

    .line 136
    goto :goto_a

    .line 137
    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    :goto_a
    add-int/2addr v0, v2

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    .line 143
    .line 144
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 145
    .line 146
    if-nez v2, :cond_b

    .line 147
    .line 148
    move v2, v1

    .line 149
    goto :goto_b

    .line 150
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    :goto_b
    add-int/2addr v0, v2

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    .line 156
    .line 157
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 158
    .line 159
    if-nez v2, :cond_c

    .line 160
    .line 161
    move v2, v1

    .line 162
    goto :goto_c

    .line 163
    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    :goto_c
    add-int/2addr v0, v2

    .line 168
    mul-int/lit8 v0, v0, 0x1f

    .line 169
    .line 170
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 171
    .line 172
    if-nez v2, :cond_d

    .line 173
    .line 174
    move v2, v1

    .line 175
    goto :goto_d

    .line 176
    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    :goto_d
    add-int/2addr v0, v2

    .line 181
    mul-int/lit8 v0, v0, 0x1f

    .line 182
    .line 183
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 184
    .line 185
    if-nez v2, :cond_e

    .line 186
    .line 187
    move v2, v1

    .line 188
    goto :goto_e

    .line 189
    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    :goto_e
    add-int/2addr v0, v2

    .line 194
    mul-int/lit8 v0, v0, 0x1f

    .line 195
    .line 196
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 197
    .line 198
    if-nez v2, :cond_f

    .line 199
    .line 200
    move v2, v1

    .line 201
    goto :goto_f

    .line 202
    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    :goto_f
    add-int/2addr v0, v2

    .line 207
    mul-int/lit8 v0, v0, 0x1f

    .line 208
    .line 209
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 210
    .line 211
    if-nez v2, :cond_10

    .line 212
    .line 213
    move v2, v1

    .line 214
    goto :goto_10

    .line 215
    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    :goto_10
    add-int/2addr v0, v2

    .line 220
    mul-int/lit8 v0, v0, 0x1f

    .line 221
    .line 222
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 223
    .line 224
    if-nez p0, :cond_11

    .line 225
    .line 226
    goto :goto_11

    .line 227
    :cond_11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    :goto_11
    add-int/2addr v0, v1

    .line 232
    return v0
.end method

.method public final setAvatarUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setEventsUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setFollowersUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setFollowingUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setGistsUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setGravatarId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setHtmlUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setLogin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNodeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setOrganizationsUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setReceivedEventsUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setReposUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSiteAdmin(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setStarredUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSubscriptionsUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/Author;->login:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/eddyizm/tempus/github/models/Author;->id:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/eddyizm/tempus/github/models/Author;->nodeId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/eddyizm/tempus/github/models/Author;->avatarUrl:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/eddyizm/tempus/github/models/Author;->gravatarId:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/eddyizm/tempus/github/models/Author;->url:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, Lcom/eddyizm/tempus/github/models/Author;->htmlUrl:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v0, Lcom/eddyizm/tempus/github/models/Author;->followersUrl:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v0, Lcom/eddyizm/tempus/github/models/Author;->followingUrl:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, v0, Lcom/eddyizm/tempus/github/models/Author;->gistsUrl:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v11, v0, Lcom/eddyizm/tempus/github/models/Author;->starredUrl:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v12, v0, Lcom/eddyizm/tempus/github/models/Author;->subscriptionsUrl:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v13, v0, Lcom/eddyizm/tempus/github/models/Author;->organizationsUrl:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v14, v0, Lcom/eddyizm/tempus/github/models/Author;->reposUrl:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/Author;->eventsUrl:Ljava/lang/String;

    .line 32
    .line 33
    move-object/from16 v16, v15

    .line 34
    .line 35
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/Author;->receivedEventsUrl:Ljava/lang/String;

    .line 36
    .line 37
    move-object/from16 v17, v15

    .line 38
    .line 39
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/Author;->type:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/eddyizm/tempus/github/models/Author;->siteAdmin:Ljava/lang/Boolean;

    .line 42
    .line 43
    move-object/from16 p0, v0

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    move-object/from16 v18, v15

    .line 48
    .line 49
    const-string v15, "Author(login="

    .line 50
    .line 51
    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", id="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", nodeId="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", avatarUrl="

    .line 71
    .line 72
    const-string v2, ", gravatarId="

    .line 73
    .line 74
    invoke-static {v0, v3, v1, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v1, ", url="

    .line 78
    .line 79
    const-string v2, ", htmlUrl="

    .line 80
    .line 81
    invoke-static {v0, v5, v1, v6, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v1, ", followersUrl="

    .line 85
    .line 86
    const-string v2, ", followingUrl="

    .line 87
    .line 88
    invoke-static {v0, v7, v1, v8, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v1, ", gistsUrl="

    .line 92
    .line 93
    const-string v2, ", starredUrl="

    .line 94
    .line 95
    invoke-static {v0, v9, v1, v10, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v1, ", subscriptionsUrl="

    .line 99
    .line 100
    const-string v2, ", organizationsUrl="

    .line 101
    .line 102
    invoke-static {v0, v11, v1, v12, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v1, ", reposUrl="

    .line 106
    .line 107
    const-string v2, ", eventsUrl="

    .line 108
    .line 109
    invoke-static {v0, v13, v1, v14, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v1, ", receivedEventsUrl="

    .line 113
    .line 114
    const-string v2, ", type="

    .line 115
    .line 116
    move-object/from16 v3, v16

    .line 117
    .line 118
    move-object/from16 v4, v17

    .line 119
    .line 120
    invoke-static {v0, v3, v1, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v1, v18

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, ", siteAdmin="

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    move-object/from16 v1, p0

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v1, ")"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0
.end method
