.class public final Leo3;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/io/Serializable;

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lgo3;

.field public s:I


# direct methods
.method public constructor <init>(Lgo3;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Leo3;->r:Lgo3;

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
    iput-object p1, p0, Leo3;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Leo3;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Leo3;->s:I

    .line 9
    .line 10
    iget-object p1, p0, Leo3;->r:Lgo3;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lgo3;->g(Llw4;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
