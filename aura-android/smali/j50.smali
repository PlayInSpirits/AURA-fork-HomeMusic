.class public final Lj50;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:B

.field public final b:B

.field public final c:S

.field public final d:Ljava/lang/String;

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj50;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput p3, p0, Lj50;->e:I

    .line 7
    .line 8
    const p1, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr p1, p2

    .line 12
    int-to-short p1, p1

    .line 13
    iput-short p1, p0, Lj50;->c:S

    .line 14
    .line 15
    shr-int/lit8 p1, p2, 0x10

    .line 16
    .line 17
    and-int/lit16 p1, p1, 0xff

    .line 18
    .line 19
    int-to-byte p1, p1

    .line 20
    iput-byte p1, p0, Lj50;->b:B

    .line 21
    .line 22
    shr-int/lit8 p1, p2, 0x18

    .line 23
    .line 24
    and-int/lit16 p1, p1, 0xff

    .line 25
    .line 26
    int-to-byte p1, p1

    .line 27
    iput-byte p1, p0, Lj50;->a:B

    .line 28
    .line 29
    return-void
.end method
