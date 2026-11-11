.class public final Li91;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public synthetic n:Ljava/lang/Object;

.field public o:I

.field public p:Lq81;

.field public final synthetic q:Lz81;


# direct methods
.method public constructor <init>(Lz81;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li91;->q:Lz81;

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
    .locals 1

    .line 1
    iput-object p1, p0, Li91;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Li91;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Li91;->o:I

    .line 9
    .line 10
    iget-object p1, p0, Li91;->q:Lz81;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lz81;->b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
