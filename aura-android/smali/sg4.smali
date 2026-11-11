.class public final Lsg4;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Lif1;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lwg4;

.field public q:I


# direct methods
.method public constructor <init>(Lwg4;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsg4;->p:Lwg4;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lsg4;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lsg4;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lsg4;->q:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lsg4;->p:Lwg4;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p1, p0}, Lwg4;->c(Lq64;FLif1;Lwd0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
