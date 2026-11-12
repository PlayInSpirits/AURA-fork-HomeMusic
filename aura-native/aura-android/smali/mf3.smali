.class public final Lmf3;
.super Lnf3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lc90;


# static fields
.field public static final q:Lmf3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmf3;

    .line 2
    .line 3
    sget-object v1, Lxx4;->e:Lxx4;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnf3;-><init>(Lxx4;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lmf3;->q:Lmf3;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Lqr3;Lj35;)Lmf3;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lnf3;->n:Lxx4;

    .line 7
    .line 8
    invoke-virtual {v2, p1, v0, p2, v1}, Lxx4;->u(Ljava/lang/Object;ILjava/lang/Object;I)Lx7;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p2, Lmf3;

    .line 16
    .line 17
    iget-object v0, p1, Lx7;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lxx4;

    .line 20
    .line 21
    iget p0, p0, Lnf3;->o:I

    .line 22
    .line 23
    iget p1, p1, Lx7;->o:I

    .line 24
    .line 25
    add-int/2addr p0, p1

    .line 26
    invoke-direct {p2, v0, p0}, Lnf3;-><init>(Lxx4;I)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lqr3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lqr3;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lnf3;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lj35;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lj35;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lnf3;->containsValue(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lqr3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Lqr3;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lnf3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lj35;

    .line 14
    .line 15
    return-object p0
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lqr3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    check-cast p1, Lqr3;

    .line 7
    .line 8
    check-cast p2, Lj35;

    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lj35;

    .line 15
    .line 16
    return-object p0
.end method
