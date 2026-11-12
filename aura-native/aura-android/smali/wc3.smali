.class public final Lwc3;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:I

.field public o:Lwd;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lad3;

.field public r:I


# direct methods
.method public constructor <init>(Lad3;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwc3;->q:Lad3;

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
    iput-object p1, p0, Lwc3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lwc3;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lwc3;->r:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lwc3;->q:Lad3;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Lad3;->f(ILwd;Lwd0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
