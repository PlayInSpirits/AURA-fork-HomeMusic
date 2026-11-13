.class public final synthetic Ldefpackage/dm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/dm3;->a:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 5
    .line 6
    iput-boolean p2, p0, Ldefpackage/dm3;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ldefpackage/dm3;->a:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 8
    .line 9
    iput-boolean v0, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->s0:Z

    .line 10
    .line 11
    iget-boolean p0, p0, Ldefpackage/dm3;->b:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-boolean p0, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->t0:Z

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    iget-object p0, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/im3;->j:Ldefpackage/k03;

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    iget-object p0, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 36
    .line 37
    invoke-virtual {p0}, Ldefpackage/im3;->h()V

    .line 38
    .line 39
    .line 40
    :cond_0
    const/4 p0, 0x1

    .line 41
    iput-boolean p0, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->t0:Z

    .line 42
    .line 43
    return-void
.end method
