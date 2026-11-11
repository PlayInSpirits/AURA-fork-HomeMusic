.class public final Lfy4;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Ljy4;

.field public o:Lyn3;

.field public p:Ljava/lang/String;

.field public q:[Ljava/lang/String;

.field public r:I

.field public s:I

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljy4;

.field public w:I


# direct methods
.method public constructor <init>(Ljy4;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfy4;->v:Ljy4;

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
    iput-object p1, p0, Lfy4;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lfy4;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lfy4;->w:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lfy4;->v:Ljy4;

    .line 13
    .line 14
    invoke-static {v1, p1, v0, p0}, Ljy4;->c(Ljy4;Lmw4;ILwd0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
