.class public final Lcom/eddyizm/tempus/github/models/LatestRelease;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private assets:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/github/models/Assets;",
            ">;"
        }
    .end annotation

    .annotation runtime Lka4;
        value = "assets"
    .end annotation
.end field

.field private assetsUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "assets_url"
    .end annotation
.end field

.field private author:Lcom/eddyizm/tempus/github/models/Author;
    .annotation runtime Lka4;
        value = "author"
    .end annotation
.end field

.field private body:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "body"
    .end annotation
.end field

.field private createdAt:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "created_at"
    .end annotation
.end field

.field private draft:Ljava/lang/Boolean;
    .annotation runtime Lka4;
        value = "draft"
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

.field private name:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "name"
    .end annotation
.end field

.field private nodeId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "node_id"
    .end annotation
.end field

.field private prerelease:Ljava/lang/Boolean;
    .annotation runtime Lka4;
        value = "prerelease"
    .end annotation
.end field

.field private publishedAt:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "published_at"
    .end annotation
.end field

.field private reactions:Lcom/eddyizm/tempus/github/models/Reactions;
    .annotation runtime Lka4;
        value = "reactions"
    .end annotation
.end field

.field private tagName:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "tag_name"
    .end annotation
.end field

.field private tarballUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "tarball_url"
    .end annotation
.end field

.field private targetCommitish:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "target_commitish"
    .end annotation
.end field

.field private uploadUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "upload_url"
    .end annotation
.end field

.field private url:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "url"
    .end annotation
.end field

.field private zipballUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "zipball_url"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 22

    .line 25
    const v20, 0x7ffff

    const/16 v21, 0x0

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

    const/16 v19, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lcom/eddyizm/tempus/github/models/LatestRelease;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/eddyizm/tempus/github/models/Author;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/github/models/Assets;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/eddyizm/tempus/github/models/Reactions;",
            ")V"
        }
    .end annotation

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    .line 11
    iput-object p6, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    .line 12
    iput-object p7, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    .line 13
    iput-object p8, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    .line 14
    iput-object p9, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    .line 15
    iput-object p10, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    .line 16
    iput-object p11, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    .line 17
    iput-object p12, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    .line 18
    iput-object p13, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    .line 19
    iput-object p14, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    .line 20
    iput-object p15, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    move-object/from16 p1, p16

    .line 21
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 22
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 23
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 24
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;ILxj0;)V
    .locals 31

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 1
    new-instance v8, Lcom/eddyizm/tempus/github/models/Author;

    const v27, 0x3ffff

    const/16 v28, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v8 .. v28}, Lcom/eddyizm/tempus/github/models/Author;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILxj0;)V

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    const/4 v7, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v0, v0, v19

    if-eqz v0, :cond_12

    .line 3
    new-instance v0, Lcom/eddyizm/tempus/github/models/Reactions;

    const/16 v19, 0x3ff

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 p1, v0

    move/from16 p12, v19

    move-object/from16 p13, v20

    move-object/from16 p2, v21

    move-object/from16 p3, v22

    move-object/from16 p4, v23

    move-object/from16 p5, v24

    move-object/from16 p6, v25

    move-object/from16 p7, v26

    move-object/from16 p8, v27

    move-object/from16 p9, v28

    move-object/from16 p10, v29

    move-object/from16 p11, v30

    invoke-direct/range {p1 .. p13}, Lcom/eddyizm/tempus/github/models/Reactions;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILxj0;)V

    move-object/from16 p20, v0

    :goto_12
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p8, v7

    move-object/from16 p7, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    .line 4
    :goto_13
    invoke-direct/range {p1 .. p20}, Lcom/eddyizm/tempus/github/models/LatestRelease;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/github/models/LatestRelease;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;ILjava/lang/Object;)Lcom/eddyizm/tempus/github/models/LatestRelease;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/eddyizm/tempus/github/models/LatestRelease;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;)Lcom/eddyizm/tempus/github/models/LatestRelease;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component13()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component14()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component15()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/github/models/Assets;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component16()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component17()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component18()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component19()Lcom/eddyizm/tempus/github/models/Reactions;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Lcom/eddyizm/tempus/github/models/Author;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component8()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component9()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;)Lcom/eddyizm/tempus/github/models/LatestRelease;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/eddyizm/tempus/github/models/Author;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/github/models/Assets;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/eddyizm/tempus/github/models/Reactions;",
            ")",
            "Lcom/eddyizm/tempus/github/models/LatestRelease;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/eddyizm/tempus/github/models/LatestRelease;

    .line 5
    .line 6
    move-object/from16 v1, p1

    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    move-object/from16 v3, p3

    .line 11
    .line 12
    move-object/from16 v4, p4

    .line 13
    .line 14
    move-object/from16 v5, p5

    .line 15
    .line 16
    move-object/from16 v6, p6

    .line 17
    .line 18
    move-object/from16 v7, p7

    .line 19
    .line 20
    move-object/from16 v8, p8

    .line 21
    .line 22
    move-object/from16 v9, p9

    .line 23
    .line 24
    move-object/from16 v10, p10

    .line 25
    .line 26
    move-object/from16 v11, p11

    .line 27
    .line 28
    move-object/from16 v12, p12

    .line 29
    .line 30
    move-object/from16 v13, p13

    .line 31
    .line 32
    move-object/from16 v14, p14

    .line 33
    .line 34
    move-object/from16 v15, p15

    .line 35
    .line 36
    move-object/from16 v16, p16

    .line 37
    .line 38
    move-object/from16 v17, p17

    .line 39
    .line 40
    move-object/from16 v18, p18

    .line 41
    .line 42
    move-object/from16 v19, p19

    .line 43
    .line 44
    invoke-direct/range {v0 .. v19}, Lcom/eddyizm/tempus/github/models/LatestRelease;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/eddyizm/tempus/github/models/Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/github/models/Reactions;)V

    .line 45
    .line 46
    .line 47
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
    instance-of v1, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;

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
    check-cast p1, Lcom/eddyizm/tempus/github/models/LatestRelease;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v3, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_13

    .line 209
    .line 210
    return v2

    .line 211
    :cond_13
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 212
    .line 213
    iget-object p1, p1, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 214
    .line 215
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-nez p0, :cond_14

    .line 220
    .line 221
    return v2

    .line 222
    :cond_14
    return v0
.end method

.method public final getAssets()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/github/models/Assets;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAssetsUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAuthor()Lcom/eddyizm/tempus/github/models/Author;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDraft()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHtmlUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNodeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPrerelease()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPublishedAt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReactions()Lcom/eddyizm/tempus/github/models/Reactions;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTagName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTarballUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTargetCommitish()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUploadUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getZipballUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

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
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

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
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

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
    invoke-virtual {v2}, Lcom/eddyizm/tempus/github/models/Author;->hashCode()I

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

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
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

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
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    add-int/2addr v2, v0

    .line 190
    mul-int/lit8 v2, v2, 0x1f

    .line 191
    .line 192
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    .line 193
    .line 194
    if-nez v0, :cond_e

    .line 195
    .line 196
    move v0, v1

    .line 197
    goto :goto_e

    .line 198
    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    :goto_e
    add-int/2addr v2, v0

    .line 203
    mul-int/lit8 v2, v2, 0x1f

    .line 204
    .line 205
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    .line 206
    .line 207
    if-nez v0, :cond_f

    .line 208
    .line 209
    move v0, v1

    .line 210
    goto :goto_f

    .line 211
    :cond_f
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    :goto_f
    add-int/2addr v2, v0

    .line 216
    mul-int/lit8 v2, v2, 0x1f

    .line 217
    .line 218
    iget-object v0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 219
    .line 220
    if-nez v0, :cond_10

    .line 221
    .line 222
    move v0, v1

    .line 223
    goto :goto_10

    .line 224
    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    :goto_10
    add-int/2addr v2, v0

    .line 229
    mul-int/lit8 v2, v2, 0x1f

    .line 230
    .line 231
    iget-object p0, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 232
    .line 233
    if-nez p0, :cond_11

    .line 234
    .line 235
    goto :goto_11

    .line 236
    :cond_11
    invoke-virtual {p0}, Lcom/eddyizm/tempus/github/models/Reactions;->hashCode()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    :goto_11
    add-int/2addr v2, v1

    .line 241
    return v2
.end method

.method public final setAssets(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/github/models/Assets;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    .line 5
    .line 6
    return-void
.end method

.method public final setAssetsUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setAuthor(Lcom/eddyizm/tempus/github/models/Author;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    .line 2
    .line 3
    return-void
.end method

.method public final setBody(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreatedAt(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDraft(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setHtmlUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNodeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPrerelease(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setPublishedAt(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setReactions(Lcom/eddyizm/tempus/github/models/Reactions;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 2
    .line 3
    return-void
.end method

.method public final setTagName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTarballUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTargetCommitish(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUploadUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setZipballUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->url:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assetsUrl:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->uploadUrl:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->htmlUrl:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->id:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->author:Lcom/eddyizm/tempus/github/models/Author;

    .line 14
    .line 15
    iget-object v7, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->nodeId:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tagName:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->targetCommitish:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->name:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v11, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->draft:Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object v12, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->prerelease:Ljava/lang/Boolean;

    .line 26
    .line 27
    iget-object v13, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->createdAt:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v14, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->publishedAt:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->assets:Ljava/util/ArrayList;

    .line 32
    .line 33
    move-object/from16 v16, v15

    .line 34
    .line 35
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->tarballUrl:Ljava/lang/String;

    .line 36
    .line 37
    move-object/from16 v17, v15

    .line 38
    .line 39
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->zipballUrl:Ljava/lang/String;

    .line 40
    .line 41
    move-object/from16 v18, v15

    .line 42
    .line 43
    iget-object v15, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->body:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/eddyizm/tempus/github/models/LatestRelease;->reactions:Lcom/eddyizm/tempus/github/models/Reactions;

    .line 46
    .line 47
    move-object/from16 p0, v0

    .line 48
    .line 49
    const-string v0, ", assetsUrl="

    .line 50
    .line 51
    move-object/from16 v19, v15

    .line 52
    .line 53
    const-string v15, ", uploadUrl="

    .line 54
    .line 55
    move-object/from16 v20, v13

    .line 56
    .line 57
    const-string v13, "LatestRelease(url="

    .line 58
    .line 59
    invoke-static {v13, v1, v0, v2, v15}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, ", htmlUrl="

    .line 64
    .line 65
    const-string v2, ", id="

    .line 66
    .line 67
    invoke-static {v0, v3, v1, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", author="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", nodeId="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", tagName="

    .line 87
    .line 88
    const-string v2, ", targetCommitish="

    .line 89
    .line 90
    invoke-static {v0, v7, v1, v8, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, ", name="

    .line 94
    .line 95
    const-string v2, ", draft="

    .line 96
    .line 97
    invoke-static {v0, v9, v1, v10, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", prerelease="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v1, ", createdAt="

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", publishedAt="

    .line 117
    .line 118
    const-string v2, ", assets="

    .line 119
    .line 120
    move-object/from16 v3, v20

    .line 121
    .line 122
    invoke-static {v0, v3, v1, v14, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object/from16 v1, v16

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", tarballUrl="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    move-object/from16 v1, v17

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", zipballUrl="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v1, ", body="

    .line 146
    .line 147
    const-string v2, ", reactions="

    .line 148
    .line 149
    move-object/from16 v3, v18

    .line 150
    .line 151
    move-object/from16 v4, v19

    .line 152
    .line 153
    invoke-static {v0, v3, v1, v4, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v1, p0

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, ")"

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0
.end method
