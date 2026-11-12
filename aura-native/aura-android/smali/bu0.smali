.class public Lbu0;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lhg3;

.field public final d:Lk03;

.field public final e:Lk03;

.field public final f:Lk03;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk03;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lbu0;->d:Lk03;

    .line 11
    .line 12
    new-instance p1, Lk03;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lbu0;->e:Lk03;

    .line 18
    .line 19
    new-instance v1, Lk03;

    .line 20
    .line 21
    invoke-direct {v1}, Lad2;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lbu0;->f:Lk03;

    .line 25
    .line 26
    new-instance v1, Lhg3;

    .line 27
    .line 28
    const/16 v2, 0xf

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lhg3;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lbu0;->c:Lhg3;

    .line 34
    .line 35
    new-instance p0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 36
    .line 37
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "default_download_view_type"

    .line 49
    .line 50
    const-string v3, "download_type_track"

    .line 51
    .line 52
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v1, v0}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final c(Lcom/eddyizm/tempus/model/DownloadStack;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lbu0;->e:Lk03;

    .line 2
    .line 3
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
