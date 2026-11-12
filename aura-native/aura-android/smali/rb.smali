.class public final Lrb;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:J

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ltb;

.field public q:I


# direct methods
.method public constructor <init>(Ltb;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrb;->p:Ltb;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lwd0;-><init>(Lvd0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iput-object p1, p0, Lrb;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lrb;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lrb;->q:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Lrb;->p:Ltb;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Ltb;->b(JLf74;Lwd0;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
