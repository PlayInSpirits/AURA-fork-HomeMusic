.class public Ldl3;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lmm3;

.field public final d:Lk03;

.field public final e:Lk03;

.field public final f:Llu2;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lmm3;

    .line 5
    .line 6
    invoke-direct {p1}, Lmm3;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldl3;->c:Lmm3;

    .line 10
    .line 11
    new-instance p1, Lk03;

    .line 12
    .line 13
    const-string v0, "ORDER_BY_NAME"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ldl3;->d:Lk03;

    .line 19
    .line 20
    new-instance v0, Lk03;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ldl3;->e:Lk03;

    .line 27
    .line 28
    new-instance v0, Lx;

    .line 29
    .line 30
    const/16 v1, 0x1d

    .line 31
    .line 32
    invoke-direct {v0, v1, p0}, Lx;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lfu;->N(Lk03;Lif1;)Llu2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Ldl3;->f:Llu2;

    .line 40
    .line 41
    invoke-static {}, Lud3;->s()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lmm3;

    .line 49
    .line 50
    invoke-direct {p1}, Lmm3;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Ldl3;->c:Lmm3;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "ViewModel setSortOrder called with: "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "TempusLog"

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "home_sort_playlists"

    .line 28
    .line 29
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Ldl3;->d:Lk03;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
