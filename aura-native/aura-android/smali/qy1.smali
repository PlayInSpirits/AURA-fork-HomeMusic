.class public final Lqy1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lkl4;


# instance fields
.field public n:Ljava/lang/Float;

.field public o:Ljava/lang/Float;

.field public final p:Lzd3;

.field public q:Lyq4;

.field public r:Z

.field public s:Z

.field public t:J

.field public final synthetic u:Lty1;


# direct methods
.method public constructor <init>(Lty1;Ljava/lang/Float;Ljava/lang/Float;Lpy1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqy1;->u:Lty1;

    .line 5
    .line 6
    iput-object p2, p0, Lqy1;->n:Ljava/lang/Float;

    .line 7
    .line 8
    iput-object p3, p0, Lqy1;->o:Ljava/lang/Float;

    .line 9
    .line 10
    invoke-static {p2}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lqy1;->p:Lzd3;

    .line 15
    .line 16
    new-instance p1, Lyq4;

    .line 17
    .line 18
    iget-object p2, p0, Lqy1;->n:Ljava/lang/Float;

    .line 19
    .line 20
    iget-object p3, p0, Lqy1;->o:Ljava/lang/Float;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p1, p4, p2, p3, v0}, Lyq4;-><init>(Lwd;Ljava/lang/Object;Ljava/lang/Float;Lce;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lqy1;->q:Lyq4;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lqy1;->p:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
