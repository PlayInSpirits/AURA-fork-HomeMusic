.class public final Ld53;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:J

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Le53;

.field public q:I


# direct methods
.method public constructor <init>(Le53;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld53;->p:Le53;

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
    iput-object p1, p0, Ld53;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ld53;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ld53;->q:I

    .line 9
    .line 10
    iget-object p1, p0, Ld53;->p:Le53;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, Le53;->s(JLvd0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
