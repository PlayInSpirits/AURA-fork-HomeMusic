.class public final Ljy3;
.super Ljx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final transient q:Lbx1;

.field public final transient r:Lky3;


# direct methods
.method public constructor <init>(Lbx1;Lky3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljy3;->q:Lbx1;

    .line 5
    .line 6
    iput-object p2, p0, Ljy3;->r:Lky3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lyw1;
    .locals 0

    .line 1
    iget-object p0, p0, Ljy3;->r:Lky3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(I[Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Ljy3;->r:Lky3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyw1;->b(I[Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ljy3;->q:Lbx1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbx1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

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
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final h()Lo15;
    .locals 1

    .line 1
    iget-object p0, p0, Ljy3;->r:Lky3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lyw1;->m(I)Lvw1;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ljy3;->q:Lbx1;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
