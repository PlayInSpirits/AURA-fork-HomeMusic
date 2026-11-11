.class public final Lnp1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk03;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/viewmodel/b;Lk03;Lcom/eddyizm/tempus/subsonic/models/ArtistID3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lnp1;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnp1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lnp1;->b:Lk03;

    .line 10
    .line 11
    iput-object p3, p0, Lnp1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lk03;Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Playlist;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lnp1;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp1;->b:Lk03;

    iput-object p2, p0, Lnp1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lnp1;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lnp1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    check-cast v2, Ljava/util/List;

    .line 8
    .line 9
    iget-object p1, p0, Lnp1;->b:Lk03;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lad2;->j(La83;)V

    .line 12
    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    sput-object p0, Lmm3;->g:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lnp1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Landroid/content/Context;

    .line 24
    .line 25
    iget-object p1, p0, Lnp1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object p0, p0, Lnp1;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v6, Lkm3;

    .line 42
    .line 43
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-static/range {v1 .. v6}, Lau0;->l(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void

    .line 51
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :goto_1
    iget-object v0, p0, Lnp1;->b:Lk03;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lnp1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Lcom/eddyizm/tempus/viewmodel/b;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->e:Lpa;

    .line 71
    .line 72
    iget-object v0, p0, Lnp1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/16 p1, 0xa

    .line 84
    .line 85
    invoke-static {p1, v0}, Lpa;->z(ILjava/lang/String;)Lk03;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1, p0}, Lad2;->j(La83;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
