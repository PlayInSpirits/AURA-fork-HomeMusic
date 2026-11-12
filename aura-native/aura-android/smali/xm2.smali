.class public final Lxm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/io/Serializable;

.field public h:Ljava/lang/Cloneable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Lly3;->t:Lly3;

    iput-object v0, p0, Lxm2;->f:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lxm2;->b:Z

    .line 31
    sget-object v0, Lyw1;->o:Lvw1;

    .line 32
    sget-object v0, Lgy3;->r:Lgy3;

    .line 33
    iput-object v0, p0, Lxm2;->g:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Lj54;Lwc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxm2;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lxm2;->e:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance p1, Lxi4;

    .line 9
    .line 10
    const/16 p2, 0xe

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lxi4;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lxm2;->f:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lxm2;->g:Ljava/io/Serializable;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lxm2;->c:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxm2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj54;

    .line 4
    .line 5
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lea2;->h:Lr92;

    .line 10
    .line 11
    sget-object v2, Lr92;->o:Lr92;

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    iget-boolean v1, p0, Lxm2;->a:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lxm2;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lwc;

    .line 22
    .line 23
    invoke-virtual {v1}, Lwc;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lpd1;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-direct {v1, v2, p0}, Lpd1;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lea2;->a(Laa2;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lxm2;->a:Z

    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-string p0, "SavedStateRegistry was already attached."

    .line 44
    .line 45
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const-string p0, "Restarter must be created only during owner\'s initialization stage"

    .line 50
    .line 51
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
