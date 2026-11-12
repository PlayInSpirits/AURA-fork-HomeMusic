.class public final Low4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq44;


# instance fields
.field public n:Lq44;

.field public final synthetic o:Lpw4;


# direct methods
.method public constructor <init>(Lpw4;Lq44;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Low4;->o:Lpw4;

    .line 5
    .line 6
    iput-object p2, p0, Low4;->n:Lq44;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Low4;->n:Lq44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lq44;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final s()V
    .locals 0

    .line 1
    iget-object p0, p0, Low4;->n:Lq44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lq44;->s()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final t(Lgp3;Lcj0;I)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Low4;->n:Lq44;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x3

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lq44;->t(Lgp3;Lcj0;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 p3, -0x4

    .line 18
    if-ne p1, p3, :cond_1

    .line 19
    .line 20
    const/4 p3, 0x4

    .line 21
    invoke-virtual {p2, p3}, Luv;->d(I)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    iget-wide v0, p2, Lcj0;->t:J

    .line 28
    .line 29
    iget-object p0, p0, Low4;->o:Lpw4;

    .line 30
    .line 31
    iget-wide v2, p0, Lpw4;->s:J

    .line 32
    .line 33
    add-long/2addr v0, v2

    .line 34
    iput-wide v0, p2, Lcj0;->t:J

    .line 35
    .line 36
    :cond_1
    return p1
.end method

.method public final u(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Low4;->n:Lq44;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Low4;->o:Lpw4;

    .line 6
    .line 7
    iget-wide v1, p0, Lpw4;->s:J

    .line 8
    .line 9
    sub-long/2addr p1, v1

    .line 10
    invoke-interface {v0, p1, p2}, Lq44;->u(J)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method
