.class public final Lmw2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static h:Lmw2;


# instance fields
.field public final a:Lr62;

.field public final b:Lzs4;

.field public final c:Lro0;

.field public final d:Lha1;

.field public final e:Lzs4;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Lr62;Lzs4;Lro0;Lha1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmw2;->a:Lr62;

    .line 5
    .line 6
    iput-object p2, p0, Lmw2;->b:Lzs4;

    .line 7
    .line 8
    iput-object p3, p0, Lmw2;->c:Lro0;

    .line 9
    .line 10
    iput-object p4, p0, Lmw2;->d:Lha1;

    .line 11
    .line 12
    invoke-static {p2, p1}, Lud3;->g0(Lzs4;Lr62;)Lzs4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lmw2;->e:Lzs4;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, Lmw2;->f:F

    .line 21
    .line 22
    iput p1, p0, Lmw2;->g:F

    .line 23
    .line 24
    return-void
.end method
