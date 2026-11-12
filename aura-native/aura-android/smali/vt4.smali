.class public final Lvt4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq44;


# instance fields
.field public final n:Lq44;

.field public final o:J


# direct methods
.method public constructor <init>(Lq44;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvt4;->n:Lq44;

    .line 5
    .line 6
    iput-wide p2, p0, Lvt4;->o:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvt4;->n:Lq44;

    .line 2
    .line 3
    invoke-interface {p0}, Lq44;->c()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final s()V
    .locals 0

    .line 1
    iget-object p0, p0, Lvt4;->n:Lq44;

    .line 2
    .line 3
    invoke-interface {p0}, Lq44;->s()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(Lgp3;Lcj0;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lvt4;->n:Lq44;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lq44;->t(Lgp3;Lcj0;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p3, -0x4

    .line 8
    if-ne p1, p3, :cond_0

    .line 9
    .line 10
    iget-wide v0, p2, Lcj0;->t:J

    .line 11
    .line 12
    iget-wide v2, p0, Lvt4;->o:J

    .line 13
    .line 14
    add-long/2addr v0, v2

    .line 15
    iput-wide v0, p2, Lcj0;->t:J

    .line 16
    .line 17
    :cond_0
    return p1
.end method

.method public final u(J)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lvt4;->o:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object p0, p0, Lvt4;->n:Lq44;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Lq44;->u(J)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method
