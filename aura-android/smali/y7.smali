.class public Ly7;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lk03;

.field public final d:Lk03;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk03;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ly7;->c:Lk03;

    .line 15
    .line 16
    new-instance p1, Lk03;

    .line 17
    .line 18
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ly7;->d:Lk03;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput p1, p0, Ly7;->e:I

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    iput p1, p0, Ly7;->f:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 9

    .line 1
    new-instance v0, Lzg5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lzg5;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Ly7;->e:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    iput v2, p0, Ly7;->e:I

    .line 11
    .line 12
    const/16 v5, 0x1f4

    .line 13
    .line 14
    mul-int v6, v5, v1

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    invoke-static {p0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lpn4;->a()Lxc5;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const-string v4, "alphabeticalByName"

    .line 28
    .line 29
    invoke-virtual/range {v3 .. v8}, Lxc5;->q(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)Lretrofit2/Call;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, Lx7;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, v6, v2, v0}, Lx7;-><init>(IILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
