.class public final Led2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final g:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final a:Lii0;

.field public final b:Landroid/net/Uri;

.field public final c:Ljava/util/Map;

.field public final d:J

.field public final e:J

.field public final f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Led2;->g:Ljava/util/concurrent/atomic/AtomicLong;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(JLii0;)V
    .locals 10

    .line 17
    iget-object v2, p3, Lii0;->a:Landroid/net/Uri;

    .line 18
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v0, p0

    move-wide v4, p1

    move-object v1, p3

    .line 19
    invoke-direct/range {v0 .. v9}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    return-void
.end method

.method public constructor <init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Led2;->a:Lii0;

    .line 5
    .line 6
    iput-object p2, p0, Led2;->b:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object p3, p0, Led2;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-wide p4, p0, Led2;->d:J

    .line 11
    .line 12
    iput-wide p6, p0, Led2;->e:J

    .line 13
    .line 14
    iput-wide p8, p0, Led2;->f:J

    .line 15
    .line 16
    return-void
.end method
