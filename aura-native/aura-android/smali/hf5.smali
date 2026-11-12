.class public final Lhf5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lve;

.field public final b:Lp61;


# direct methods
.method public synthetic constructor <init>(Lve;Lp61;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhf5;->a:Lve;

    .line 5
    .line 6
    iput-object p2, p0, Lhf5;->b:Lp61;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p1, Lhf5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lhf5;

    .line 8
    .line 9
    iget-object v0, p0, Lhf5;->a:Lve;

    .line 10
    .line 11
    iget-object v1, p1, Lhf5;->a:Lve;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lhf5;->b:Lp61;

    .line 20
    .line 21
    iget-object p1, p1, Lhf5;->b:Lp61;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lhf5;->a:Lve;

    .line 2
    .line 3
    iget-object p0, p0, Lhf5;->b:Lp61;

    .line 4
    .line 5
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lqr2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lqr2;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "key"

    .line 7
    .line 8
    iget-object v2, p0, Lhf5;->a:Lve;

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Lqr2;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "feature"

    .line 14
    .line 15
    iget-object p0, p0, Lhf5;->b:Lp61;

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Lqr2;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lqr2;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
